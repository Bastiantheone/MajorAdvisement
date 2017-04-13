package engineering.software.gsu.majoradvisement;


import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import engineering.software.gsu.majoradvisement.QuestionDbSchema.*;

public class QuestionBaseHelper extends SQLiteOpenHelper {
    private static final int VERSION = 1;
    private static final String DATABASE_NAME = "question.db";

    public QuestionBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(
                "create table " + gamemaster_Table.game_master_table +
                        "(" + gamemaster_Table.GameMasterCols.user_name +
                        "," + gamemaster_Table.GameMasterCols.password +
                        "," + gamemaster_Table.GameMasterCols.fun +
                        "," + gamemaster_Table.GameMasterCols.global_ce_score +
                        "," + gamemaster_Table.GameMasterCols.global_cs_score +
                        "," + gamemaster_Table.GameMasterCols.global_is_score +
                        "," + gamemaster_Table.GameMasterCols.global_it_score +
                        "," + gamemaster_Table.GameMasterCols.global_score + ");"

        );
/*
        sqLiteDatabase.execSQL(

                "insert into " + gamemaster_Table.game_master_table +
                        " values ( " +
                        "'abc' , " +
                        "'123' , " +
                        0+", " +
                        0+", " +
                        0 +", " +
                        0+" , " +
                        0+" , " +
                        0+" );"

        );
*/
        ContentValues contentValues = new ContentValues();
        contentValues.put(gamemaster_Table.GameMasterCols.user_name,"abc");
        contentValues.put(gamemaster_Table.GameMasterCols.password,"123");
        contentValues.put(gamemaster_Table.GameMasterCols.fun,0);
        contentValues.put(gamemaster_Table.GameMasterCols.global_score,0);
        contentValues.put(gamemaster_Table.GameMasterCols.global_cs_score,0);
        contentValues.put(gamemaster_Table.GameMasterCols.global_it_score,0);
        contentValues.put(gamemaster_Table.GameMasterCols.global_is_score,0);
        contentValues.put(gamemaster_Table.GameMasterCols.global_ce_score,0);
        sqLiteDatabase.insert(gamemaster_Table.game_master_table, null,contentValues);



        sqLiteDatabase.execSQL(
                "create table " + gamemaster_Table.answer_table +
                        "(" + gamemaster_Table.answer_cols.text +
                        "," + gamemaster_Table.answer_cols.score +
                        "," + gamemaster_Table.answer_cols.csRating +
                        "," + gamemaster_Table.answer_cols.itRating +
                        "," + gamemaster_Table.answer_cols.isRating +
                        "," + gamemaster_Table.answer_cols.ceRating +
                        "," + gamemaster_Table.answer_cols.answer_id + ");"
        );

        sqLiteDatabase.execSQL(
                "insert into " + gamemaster_Table.answer_table +
                        " values ('Java', "+0+" , "+0+", "+8+", "+10+", "+3+", "+1+"); "

        );

        sqLiteDatabase.execSQL(
                "insert into " + gamemaster_Table.answer_table +
                        " values ('Snake' , "+10+" , "+10+" , "+1+" , "+2+", "+4+", "+1+"); "
        );

        // FIXME Ken: change all integers to be ints not strings like above

        sqLiteDatabase.execSQL(
                "insert into " + gamemaster_Table.answer_table +
                        " values ('Swift' , "+0+" , "+0+" , "+8+" , "+10+" , "+3+", "+1+ "); "
        );

        sqLiteDatabase.execSQL(
                "insert into " + gamemaster_Table.answer_table +
                        " values ('Ruby' ,"+0+" , "+0+" , "+8+" , "+10+", "+3+", "+1+"); "
        );


        sqLiteDatabase.execSQL(
                "insert into " + gamemaster_Table.answer_table +
                        " values ('Linux' , "+0+" , "+6+" , "+0+" , "+4+", "+1+", "+2+"); "

        );

        sqLiteDatabase.execSQL(
                "insert into " + gamemaster_Table.answer_table +
                        " values ('Windows' , "+0+" , "+0+" , "+4+" , "+4+", "+1+", "+2+"); "
        );

        sqLiteDatabase.execSQL(
                "insert into " + gamemaster_Table.answer_table +
                        " values ('Firefox' , "+0+" , "+0+" , "+10+" , "+4+", "+7+", "+2+"); "
        );

        sqLiteDatabase.execSQL(
                "insert into " + gamemaster_Table.answer_table +
                        " values ('Unix' , "+0+" , "+6+" , "+0+" , "+4+", "+1+", "+2+"); "
        );


        sqLiteDatabase.execSQL(
                "insert into " + gamemaster_Table.answer_table +
                        " values ('Hardware' , "+6+" , "+6+" , "+10+" , "+4+", "+1+", "+3+"); "

        );

        sqLiteDatabase.execSQL(
                "insert into " + gamemaster_Table.answer_table +
                        " values ('Software' , "+6+" , "+10+" , "+4+" , "+4+", "+5+", "+3+"); "
        );

        sqLiteDatabase.execSQL(
                "insert into " + gamemaster_Table.answer_table +
                        " values ('Both', "+6+" , "+6+" , "+5+" , "+6+", "+10+", "+3+"); "
        );

        sqLiteDatabase.execSQL(
                "insert into " + gamemaster_Table.answer_table +
                        " values ('Neither' , "+6+" , "+6+" , "+10+" ,"+4+",  "+2+", "+3+"); "
        );


        sqLiteDatabase.execSQL(
                "insert into " + gamemaster_Table.answer_table +
                        " values ('Memory' , "+6+" , "+2+" , "+8+" , "+2+", "+8+", "+4+"); "

        );

        sqLiteDatabase.execSQL(
                "insert into " + gamemaster_Table.answer_table +
                        " values ('Storage' , "+6+" , "+0+" , "+6+" , "+0+", "+4+", "+4+"); "
        );

        sqLiteDatabase.execSQL(
                "insert into " + gamemaster_Table.answer_table +
                        " values ('Input', "+6+" , "+2+" , "+0+" , "+0+", "+0+", "+4+"); "
        );

        sqLiteDatabase.execSQL(
                "insert into " + gamemaster_Table.answer_table +
                        " values ('Output', "+10+" , "+2+" , "+0+" , "+0+" , "+0+", "+4+"); "
        );


        //do an insert statement for each answer for each question
        sqLiteDatabase.execSQL(
                "create table " + gamemaster_Table.image_table +
                        "(" + gamemaster_Table.image_cols.leftAnswer +
                        "," + gamemaster_Table.image_cols.rightAnswer +
                        "," + gamemaster_Table.image_cols.imgID +
                        "," + gamemaster_Table.image_cols.answers_id +
                        ");"
        );

        // FIXME Ken: add images and also add the corresponding answer to the answer table
        /*sqLiteDatabase.execSQL(

            Insert the values for the image table
        );
        */

        sqLiteDatabase.execSQL(
                "create table " + gamemaster_Table.swipe_table +
                        "(" + gamemaster_Table.swipe_cols.textLeft +
                        "," + gamemaster_Table.swipe_cols.textRight +", "+
                        gamemaster_Table.swipe_cols.answers_id+ ", "+
                        gamemaster_Table.swipe_cols.fun +
                        ");"
        );

        sqLiteDatabase.execSQL(
                "insert into " + gamemaster_Table.swipe_table +
                        " values ( " + " 'Computer Science', 'Information Technology', "+ R.raw.code_image+ "," + R.raw.hardware_image +
        ");"// FIXME Kwame: add fun

        );


        sqLiteDatabase.execSQL(
                "create table " + gamemaster_Table.ratequestion_table +
                        "(" + gamemaster_Table.ratequestion_cols.text +
                        "," + gamemaster_Table.ratequestion_cols.score +
                        "," + gamemaster_Table.ratequestion_cols.cs +
                        "," + gamemaster_Table.ratequestion_cols.it +
                        "," + gamemaster_Table.ratequestion_cols.is +
                        "," + gamemaster_Table.ratequestion_cols.ce +", "+
                        gamemaster_Table.ratequestion_cols.fun+ "," +gamemaster_Table.ratequestion_cols.focus +
                        ");"
        );

        // FIXME Kwame: add fun to all
        sqLiteDatabase.execSQL(
                "insert into " + gamemaster_Table.ratequestion_table +
                        " values ( " +
                        "'How would you rate your math skills?',  " +
                        "6"+ "," + "7" +"," +3+ "," + 0 + "," +10+ "," +1+ "," +1+  ");"

        );


        sqLiteDatabase.execSQL(
                "insert into " + gamemaster_Table.ratequestion_table +
                        " values ( " +
                        "'How would you rate your critical thinking skills?',  " +
                        6 +","+ 7+","+ 3+"," +0+","+ 10+"," +2+ "," +2+ " );"

        );

        sqLiteDatabase.execSQL(
                "insert into " + gamemaster_Table.ratequestion_table +
                        " values ( " +
                        "'How often do you do you build technology related items?',  " +
                        6+ "," + 7+ "," + 3+ "," +0+ "," +10+ "," +3 + "," +3+ " );"

        );

        sqLiteDatabase.execSQL(
                "insert into " + gamemaster_Table.ratequestion_table +
                        " values ( " +
                        "'How often do you program computers?',  " +
                        6+ "," + 7+ "," + 3+ "," + 0+ "," +10+","+ 4+ "," +4+ ");"

        );


        sqLiteDatabase.execSQL(
                "create table " + gamemaster_Table.textquestion_table +
                        "(" + gamemaster_Table.textquestion_cols.text +
                        "," + gamemaster_Table.textquestion_cols.answer_id +", "+
                        gamemaster_Table.textquestion_cols.fun+ ", " + gamemaster_Table.textquestion_cols.focus +
                        ");"
        );

    // FIXME Kwame: add fun to all
        sqLiteDatabase.execSQL(
                "insert into " + gamemaster_Table.textquestion_table +
                        " values ( " +
                        "'Which one of these are not a programming language?' , " +
                        "1, 1, 1 );"
        );


        sqLiteDatabase.execSQL(
                "insert into " + gamemaster_Table.textquestion_table +
                        " values ( " +
                        "'Which one of these are not an Operating System?' , " +
                        "2,2,3 );"
        );
        sqLiteDatabase.execSQL(
                "insert into " + gamemaster_Table.textquestion_table +
                        " values ( " +
                        "'Would you rather work with the hardware or the software components of a computer?' , " +
                        "3,3,4 );"
        );
        sqLiteDatabase.execSQL(
                "insert into " + gamemaster_Table.textquestion_table +
                        " values ( " +
                        "'____ is the area of a computer that temporarily holds data that is waiting to be processed, stored, or output?' , " +
                        "4,4,2 );"
        );


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
