package engineering.software.gsu.majoradvisement;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.provider.ContactsContract;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bastian Wieck on 4/13/2017.
 */

public class DbConnect {
    private static DbConnect dbConnect;
    private Context context;
    private SQLiteDatabase mDatabase;

    public static DbConnect get(Context context){
        if(dbConnect == null){
            dbConnect = new DbConnect(context);
        }
        return dbConnect;
    }

    private DbConnect(Context context){
        context = context.getApplicationContext();
        mDatabase = new QuestionBaseHelper(context).getWritableDatabase();
    }

    private QuestionWrapper queryGamemaster(String whereClause, String[] whereArgs){
        Cursor cursor = mDatabase.query(
                QuestionDbSchema.gamemaster_Table.game_master_table,
                null,
                whereClause,
                whereArgs,
                null,
                null,
                null
        );
        return new QuestionWrapper(cursor);
    }

    private QuestionWrapper queryAnswers(String whereClause, String[] whereArgs){
        Cursor cursor = mDatabase.query(
                QuestionDbSchema.gamemaster_Table.answer_table,
                null,
                whereClause,
                whereArgs,
                null,
                null,
                null
        );
        return new QuestionWrapper(cursor);
    }
    private QuestionWrapper queryImages(String whereClause, String[] whereArgs){
        Cursor cursor = mDatabase.query(
                QuestionDbSchema.gamemaster_Table.image_table,
                null,
                whereClause,
                whereArgs,
                null,
                null,
                null
        );
        return new QuestionWrapper(cursor);
    }
    private QuestionWrapper querySwipes(String whereClause, String[] whereArgs){
        Cursor cursor = mDatabase.query(
                QuestionDbSchema.gamemaster_Table.swipe_table,
                null,
                whereClause,
                whereArgs,
                null,
                null,
                null
        );
        return new QuestionWrapper(cursor);
    }
    private QuestionWrapper queryRateQestion(String whereClause, String[] whereArgs){
        Cursor cursor = mDatabase.query(
                QuestionDbSchema.gamemaster_Table.ratequestion_table,
                null,
                whereClause,
                whereArgs,
                null,
                null,
                null
        );
        return new QuestionWrapper(cursor);
    }
    private QuestionWrapper queryTextQuestion(String whereClause, String[] whereArgs){
        Cursor cursor = mDatabase.query(
                QuestionDbSchema.gamemaster_Table.textquestion_table,
                null,
                whereClause,
                whereArgs,
                null,
                null,
                null
        );
        return new QuestionWrapper(cursor);
    }

    public List<Question> getQuestion(){
        List<Question> questions = new ArrayList<>();
        QuestionWrapper cursor = queryRateQestion(null,null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){
            RateQuestion question = cursor.ratey();
            questions.add(question);
            cursor.moveToNext();
        }
        cursor.close();

        cursor = queryTextQuestion(null,null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){
            TextQuestion question = cursor.texty();
            question.addAnswers(getAnswers(question.id));
            questions.add(question);
            cursor.moveToNext();
        }
        cursor.close();

        cursor = querySwipes(null,null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){
            SwipeQuestion question = cursor.swipey();
            question.addImages(getImages(question.id));
            questions.add(question);
            cursor.moveToNext();
        }
        cursor.close();

        return questions;
    }
    private List<Answer> getAnswers(int id){
        List<Answer> answers = new ArrayList<>(4);
        String where = QuestionDbSchema.gamemaster_Table.answer_cols.answer_id + " = "+id;
        QuestionWrapper cursor = queryAnswers(where,null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){
            Answer answer = cursor.getAnswer();
            answers.add(answer);
            cursor.moveToNext();
        }
        cursor.close();
        return answers;
    }
    private List<Image>getImages(int id){
        List<Image> images = new ArrayList<>(2);
        String where = QuestionDbSchema.gamemaster_Table.image_cols.answers_id+ " = "+id;//is going to get added
        QuestionWrapper cursor = queryImages(where,null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){
            Image image = cursor.images();
            images.add(image);
            cursor.moveToNext();
        }
        cursor.close();
        return images;
    }
}

