package engineering.software.gsu.majoradvisement;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
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
            Question question = cursor.ratey();
            questions.add(question);
            cursor.moveToNext();
        }
        cursor.close();

        cursor = queryTextQuestion(null,null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){
            Question question = cursor.texty();
            getAnswer(question.id);
            questions.add(question);
            cursor.moveToNext();
        }
        cursor.close();

        return questions;
    }
    private Answer getAnswer(int id){
        
    }
    // FIXME


}

