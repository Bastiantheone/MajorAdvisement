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

    public List<Question> getQuestion(int focus){
        String where = " = "+focus;
        String whereR = QuestionDbSchema.gamemaster_Table.ratequestion_cols.focus + where;
        List<Question> questions = new ArrayList<>();
        QuestionWrapper cursor = queryRateQestion(whereR,null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){
            RateQuestion question = cursor.ratey();
            questions.add(question);
            cursor.moveToNext();
        }
        cursor.close();

        String whereT = QuestionDbSchema.gamemaster_Table.textquestion_cols.focus + where;
        cursor = queryTextQuestion(whereT,null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){
            TextQuestion question = cursor.texty();
            question.addAnswers(getAnswers(question.id));
            questions.add(question);
            cursor.moveToNext();
        }
        cursor.close();

        String whereS = QuestionDbSchema.gamemaster_Table.swipe_cols.focus + where;
        cursor = querySwipes(whereS,null);
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
        String where = QuestionDbSchema.gamemaster_Table.image_cols.answers_id+ " = "+id;
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

    public GMHolder getGM(String username, String password){
        String where = QuestionDbSchema.gamemaster_Table.GameMasterCols.user_name+" = '"+username+"'"+
                " AND "+ QuestionDbSchema.gamemaster_Table.GameMasterCols.password+" = '"+password+"'";
        QuestionWrapper cursor = queryGamemaster(where,null);
        cursor.moveToFirst();
        GMHolder gm = null;
        while (!cursor.isAfterLast()){
            gm = cursor.getGameMaster();
            cursor.moveToNext();
        }
        cursor.close();
        return gm;
    }
}

