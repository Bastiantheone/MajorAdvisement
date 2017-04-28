package engineering.software.gsu.majoradvisement;


import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import engineering.software.gsu.majoradvisement.QuestionDbSchema.*;

public class QuestionBaseHelper extends SQLiteOpenHelper {
    public static final int CS_FOCUS = 1;
    public static final int CE_FOCUS = 2;
    public static final int IT_FOCUS = 3;
    public static final int IS_FOCUS = 4;

    private static final int VERSION = 1;
    private static final String DATABASE_NAME = "question.db";

    public QuestionBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        // FIXME add enough questions so that each focus has all fun values

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

        ContentValues contentValues = new ContentValues();
        contentValues.put(gamemaster_Table.GameMasterCols.user_name, "abc");
        contentValues.put(gamemaster_Table.GameMasterCols.password, "123");
        contentValues.put(gamemaster_Table.GameMasterCols.fun, -1);
        contentValues.put(gamemaster_Table.GameMasterCols.global_score, 0);
        contentValues.put(gamemaster_Table.GameMasterCols.global_cs_score, 0);
        contentValues.put(gamemaster_Table.GameMasterCols.global_it_score, 0);
        contentValues.put(gamemaster_Table.GameMasterCols.global_is_score, 0);
        contentValues.put(gamemaster_Table.GameMasterCols.global_ce_score, 0);
        sqLiteDatabase.insert(gamemaster_Table.game_master_table, null, contentValues);


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

        ContentValues contentValues1 = new ContentValues();
        contentValues1.put(gamemaster_Table.answer_cols.text, "Java");
        contentValues1.put(gamemaster_Table.answer_cols.score, 0);
        contentValues1.put(gamemaster_Table.answer_cols.itRating, 0);
        contentValues1.put(gamemaster_Table.answer_cols.csRating, 8);
        contentValues1.put(gamemaster_Table.answer_cols.isRating, 10);
        contentValues1.put(gamemaster_Table.answer_cols.ceRating, 3);
        contentValues1.put(gamemaster_Table.answer_cols.answer_id, 1);
        sqLiteDatabase.insert(gamemaster_Table.answer_table, null, contentValues1);


        ContentValues contentValues2 = new ContentValues();
        contentValues2.put(gamemaster_Table.answer_cols.text, "Snake");
        contentValues2.put(gamemaster_Table.answer_cols.score, 10);
        contentValues2.put(gamemaster_Table.answer_cols.itRating, 10);
        contentValues2.put(gamemaster_Table.answer_cols.csRating, 1);
        contentValues2.put(gamemaster_Table.answer_cols.isRating, 2);
        contentValues2.put(gamemaster_Table.answer_cols.ceRating, 4);
        contentValues2.put(gamemaster_Table.answer_cols.answer_id, 1);
        sqLiteDatabase.insert(gamemaster_Table.answer_table, null, contentValues2);

        ContentValues contentValues3 = new ContentValues();
        contentValues3.put(gamemaster_Table.answer_cols.text, "Swift");
        contentValues3.put(gamemaster_Table.answer_cols.score, 0);
        contentValues3.put(gamemaster_Table.answer_cols.itRating, 0);
        contentValues3.put(gamemaster_Table.answer_cols.csRating, 8);
        contentValues3.put(gamemaster_Table.answer_cols.isRating, 10);
        contentValues3.put(gamemaster_Table.answer_cols.ceRating, 3);
        contentValues3.put(gamemaster_Table.answer_cols.answer_id, 1);
        sqLiteDatabase.insert(gamemaster_Table.answer_table, null, contentValues3);


        ContentValues contentValues4 = new ContentValues();
        contentValues4.put(gamemaster_Table.answer_cols.text, "Ruby");
        contentValues4.put(gamemaster_Table.answer_cols.score, 0);
        contentValues4.put(gamemaster_Table.answer_cols.itRating, 0);
        contentValues4.put(gamemaster_Table.answer_cols.csRating, 8);
        contentValues4.put(gamemaster_Table.answer_cols.isRating, 10);
        contentValues4.put(gamemaster_Table.answer_cols.ceRating, 3);
        contentValues4.put(gamemaster_Table.answer_cols.answer_id, 1);
        sqLiteDatabase.insert(gamemaster_Table.answer_table, null, contentValues4);

        ContentValues contentValues5 = new ContentValues();
        contentValues5.put(gamemaster_Table.answer_cols.text, "Linux");
        contentValues5.put(gamemaster_Table.answer_cols.score, 0);
        contentValues5.put(gamemaster_Table.answer_cols.itRating, 6);
        contentValues5.put(gamemaster_Table.answer_cols.csRating, 0);
        contentValues5.put(gamemaster_Table.answer_cols.isRating, 4);
        contentValues5.put(gamemaster_Table.answer_cols.ceRating, 1);
        contentValues5.put(gamemaster_Table.answer_cols.answer_id, 2);
        sqLiteDatabase.insert(gamemaster_Table.answer_table, null, contentValues5);

        ContentValues contentValues6 = new ContentValues();
        contentValues6.put(gamemaster_Table.answer_cols.text, "Windows");
        contentValues6.put(gamemaster_Table.answer_cols.score, 0);
        contentValues6.put(gamemaster_Table.answer_cols.itRating, 0);
        contentValues6.put(gamemaster_Table.answer_cols.csRating, 4);
        contentValues6.put(gamemaster_Table.answer_cols.isRating, 4);
        contentValues6.put(gamemaster_Table.answer_cols.ceRating, 1);
        contentValues6.put(gamemaster_Table.answer_cols.answer_id, 2);
        sqLiteDatabase.insert(gamemaster_Table.answer_table, null, contentValues6);


        ContentValues contentValues7 = new ContentValues();
        contentValues7.put(gamemaster_Table.answer_cols.text, "Firefox");
        contentValues7.put(gamemaster_Table.answer_cols.score, 0);
        contentValues7.put(gamemaster_Table.answer_cols.itRating, 0);
        contentValues7.put(gamemaster_Table.answer_cols.csRating, 10);
        contentValues7.put(gamemaster_Table.answer_cols.isRating, 4);
        contentValues7.put(gamemaster_Table.answer_cols.ceRating, 7);
        contentValues7.put(gamemaster_Table.answer_cols.answer_id, 2);
        sqLiteDatabase.insert(gamemaster_Table.answer_table, null, contentValues7);

        ContentValues contentValues8 = new ContentValues();
        contentValues8.put(gamemaster_Table.answer_cols.text, "Unix");
        contentValues8.put(gamemaster_Table.answer_cols.score, 0);
        contentValues8.put(gamemaster_Table.answer_cols.itRating, 6);
        contentValues8.put(gamemaster_Table.answer_cols.csRating, 0);
        contentValues8.put(gamemaster_Table.answer_cols.isRating, 4);
        contentValues8.put(gamemaster_Table.answer_cols.ceRating, 1);
        contentValues8.put(gamemaster_Table.answer_cols.answer_id, 2);
        sqLiteDatabase.insert(gamemaster_Table.answer_table, null, contentValues8);

        ContentValues contentValues9 = new ContentValues();
        contentValues9.put(gamemaster_Table.answer_cols.text, "Hardware");
        contentValues9.put(gamemaster_Table.answer_cols.score, 6);
        contentValues9.put(gamemaster_Table.answer_cols.itRating, 6);
        contentValues9.put(gamemaster_Table.answer_cols.csRating, 10);
        contentValues9.put(gamemaster_Table.answer_cols.isRating, 4);
        contentValues9.put(gamemaster_Table.answer_cols.ceRating, 1);
        contentValues9.put(gamemaster_Table.answer_cols.answer_id, 3);
        sqLiteDatabase.insert(gamemaster_Table.answer_table, null, contentValues9);

        ContentValues contentValues10 = new ContentValues();
        contentValues10.put(gamemaster_Table.answer_cols.text, "Software");
        contentValues10.put(gamemaster_Table.answer_cols.score, 6);
        contentValues10.put(gamemaster_Table.answer_cols.itRating, 10);
        contentValues10.put(gamemaster_Table.answer_cols.csRating, 4);
        contentValues10.put(gamemaster_Table.answer_cols.isRating, 4);
        contentValues10.put(gamemaster_Table.answer_cols.ceRating, 5);
        contentValues10.put(gamemaster_Table.answer_cols.answer_id, 3);
        sqLiteDatabase.insert(gamemaster_Table.answer_table, null, contentValues10);

        ContentValues contentValues11 = new ContentValues();
        contentValues11.put(gamemaster_Table.answer_cols.text, "Both");
        contentValues11.put(gamemaster_Table.answer_cols.score, 6);
        contentValues11.put(gamemaster_Table.answer_cols.itRating, 6);
        contentValues11.put(gamemaster_Table.answer_cols.csRating, 5);
        contentValues11.put(gamemaster_Table.answer_cols.isRating, 6);
        contentValues11.put(gamemaster_Table.answer_cols.ceRating, 10);
        contentValues11.put(gamemaster_Table.answer_cols.answer_id, 3);
        sqLiteDatabase.insert(gamemaster_Table.answer_table, null, contentValues11);

        ContentValues contentValues12 = new ContentValues();
        contentValues12.put(gamemaster_Table.answer_cols.text, "Neither");
        contentValues12.put(gamemaster_Table.answer_cols.score, 6);
        contentValues12.put(gamemaster_Table.answer_cols.itRating, 6);
        contentValues12.put(gamemaster_Table.answer_cols.csRating, 10);
        contentValues12.put(gamemaster_Table.answer_cols.isRating, 4);
        contentValues12.put(gamemaster_Table.answer_cols.ceRating, 2);
        contentValues12.put(gamemaster_Table.answer_cols.answer_id, 3);
        sqLiteDatabase.insert(gamemaster_Table.answer_table, null, contentValues12);

        ContentValues contentValues13 = new ContentValues();
        contentValues13.put(gamemaster_Table.answer_cols.text, "Memory");
        contentValues13.put(gamemaster_Table.answer_cols.score, 6);
        contentValues13.put(gamemaster_Table.answer_cols.itRating, 2);
        contentValues13.put(gamemaster_Table.answer_cols.csRating, 8);
        contentValues13.put(gamemaster_Table.answer_cols.isRating, 2);
        contentValues13.put(gamemaster_Table.answer_cols.ceRating, 8);
        contentValues13.put(gamemaster_Table.answer_cols.answer_id, 4);
        sqLiteDatabase.insert(gamemaster_Table.answer_table, null, contentValues13);

        ContentValues contentValues14 = new ContentValues();
        contentValues14.put(gamemaster_Table.answer_cols.text, "Storage");
        contentValues14.put(gamemaster_Table.answer_cols.score, 6);
        contentValues14.put(gamemaster_Table.answer_cols.itRating, 0);
        contentValues14.put(gamemaster_Table.answer_cols.csRating, 6);
        contentValues14.put(gamemaster_Table.answer_cols.isRating, 0);
        contentValues14.put(gamemaster_Table.answer_cols.ceRating, 4);
        contentValues14.put(gamemaster_Table.answer_cols.answer_id, 4);
        sqLiteDatabase.insert(gamemaster_Table.answer_table, null, contentValues14);

        ContentValues contentValues15 = new ContentValues();
        contentValues15.put(gamemaster_Table.answer_cols.text, "Input");
        contentValues15.put(gamemaster_Table.answer_cols.score, 6);
        contentValues15.put(gamemaster_Table.answer_cols.itRating, 2);
        contentValues15.put(gamemaster_Table.answer_cols.csRating, 0);
        contentValues15.put(gamemaster_Table.answer_cols.isRating, 0);
        contentValues15.put(gamemaster_Table.answer_cols.ceRating, 0);
        contentValues15.put(gamemaster_Table.answer_cols.answer_id, 4);
        sqLiteDatabase.insert(gamemaster_Table.answer_table, null, contentValues15);

        ContentValues contentValues16 = new ContentValues();
        contentValues16.put(gamemaster_Table.answer_cols.text, "Output");
        contentValues16.put(gamemaster_Table.answer_cols.score, 10);
        contentValues16.put(gamemaster_Table.answer_cols.score, 2);
        contentValues16.put(gamemaster_Table.answer_cols.csRating, 0);
        contentValues16.put(gamemaster_Table.answer_cols.isRating, 0);
        contentValues16.put(gamemaster_Table.answer_cols.ceRating, 0);
        contentValues16.put(gamemaster_Table.answer_cols.answer_id, 4);
        sqLiteDatabase.insert(gamemaster_Table.answer_table, null, contentValues16);

        ContentValues contentValues29 = new ContentValues();
        contentValues29.put(gamemaster_Table.answer_cols.text, "Computer Science");
        contentValues29.put(gamemaster_Table.answer_cols.score, 1);
        contentValues29.put(gamemaster_Table.answer_cols.itRating, 0);
        contentValues29.put(gamemaster_Table.answer_cols.csRating, 5);
        contentValues29.put(gamemaster_Table.answer_cols.isRating, 0);
        contentValues29.put(gamemaster_Table.answer_cols.ceRating, 0);
        contentValues29.put(gamemaster_Table.answer_cols.answer_id, 5);
        sqLiteDatabase.insert(gamemaster_Table.answer_table, null, contentValues29);

        ContentValues contentValues30 = new ContentValues();
        contentValues30.put(gamemaster_Table.answer_cols.text, "Computer Engineering");
        contentValues30.put(gamemaster_Table.answer_cols.score, 1);
        contentValues30.put(gamemaster_Table.answer_cols.itRating, 0);
        contentValues30.put(gamemaster_Table.answer_cols.csRating, 0);
        contentValues30.put(gamemaster_Table.answer_cols.isRating, 0);
        contentValues30.put(gamemaster_Table.answer_cols.ceRating, 5);
        contentValues30.put(gamemaster_Table.answer_cols.answer_id, 5);
        sqLiteDatabase.insert(gamemaster_Table.answer_table, null, contentValues30);

        ContentValues contentValues31 = new ContentValues();
        contentValues31.put(gamemaster_Table.answer_cols.text, "Information Technology");
        contentValues31.put(gamemaster_Table.answer_cols.score, 1);
        contentValues31.put(gamemaster_Table.answer_cols.itRating, 5);
        contentValues31.put(gamemaster_Table.answer_cols.csRating, 0);
        contentValues31.put(gamemaster_Table.answer_cols.isRating, 0);
        contentValues31.put(gamemaster_Table.answer_cols.ceRating, 0);
        contentValues31.put(gamemaster_Table.answer_cols.answer_id, 5);
        sqLiteDatabase.insert(gamemaster_Table.answer_table, null, contentValues31);

        ContentValues contentValues32 = new ContentValues();
        contentValues32.put(gamemaster_Table.answer_cols.text, "Information Systems");
        contentValues32.put(gamemaster_Table.answer_cols.score, 1);
        contentValues32.put(gamemaster_Table.answer_cols.itRating, 0);
        contentValues32.put(gamemaster_Table.answer_cols.csRating, 0);
        contentValues32.put(gamemaster_Table.answer_cols.isRating, 5);
        contentValues32.put(gamemaster_Table.answer_cols.ceRating, 0);
        contentValues32.put(gamemaster_Table.answer_cols.answer_id, 5);
        sqLiteDatabase.insert(gamemaster_Table.answer_table, null, contentValues32);

        ContentValues contentValues38 = new ContentValues();
        contentValues38.put(gamemaster_Table.answer_cols.text, "Embedded Systems");
        contentValues38.put(gamemaster_Table.answer_cols.score, 5);
        contentValues38.put(gamemaster_Table.answer_cols.itRating, 0);
        contentValues38.put(gamemaster_Table.answer_cols.csRating, 0);
        contentValues38.put(gamemaster_Table.answer_cols.isRating, 0);
        contentValues38.put(gamemaster_Table.answer_cols.ceRating, 10);
        contentValues38.put(gamemaster_Table.answer_cols.answer_id, 6);
        sqLiteDatabase.insert(gamemaster_Table.answer_table, null, contentValues38);

        ContentValues contentValues39 = new ContentValues();
        contentValues39.put(gamemaster_Table.answer_cols.text, "Game Programming");
        contentValues39.put(gamemaster_Table.answer_cols.score, 5);
        contentValues39.put(gamemaster_Table.answer_cols.itRating, 0);
        contentValues39.put(gamemaster_Table.answer_cols.csRating, 8);
        contentValues39.put(gamemaster_Table.answer_cols.isRating, 0);
        contentValues39.put(gamemaster_Table.answer_cols.ceRating, 0);
        contentValues39.put(gamemaster_Table.answer_cols.answer_id, 6);
        sqLiteDatabase.insert(gamemaster_Table.answer_table, null, contentValues39);

        ContentValues contentValues40 = new ContentValues();
        contentValues40.put(gamemaster_Table.answer_cols.text, "Design complex systems");
        contentValues40.put(gamemaster_Table.answer_cols.score, 5);
        contentValues40.put(gamemaster_Table.answer_cols.itRating, 0);
        contentValues40.put(gamemaster_Table.answer_cols.csRating, 0);
        contentValues40.put(gamemaster_Table.answer_cols.isRating, 10);
        contentValues40.put(gamemaster_Table.answer_cols.ceRating, 0);
        contentValues40.put(gamemaster_Table.answer_cols.answer_id, 6);
        sqLiteDatabase.insert(gamemaster_Table.answer_table, null, contentValues40);

        ContentValues contentValues41 = new ContentValues();
        contentValues41.put(gamemaster_Table.answer_cols.text, "Routers, Websites");
        contentValues41.put(gamemaster_Table.answer_cols.score, 5);
        contentValues41.put(gamemaster_Table.answer_cols.itRating, 10);
        contentValues41.put(gamemaster_Table.answer_cols.csRating, 0);
        contentValues41.put(gamemaster_Table.answer_cols.isRating, 0);
        contentValues41.put(gamemaster_Table.answer_cols.ceRating, 0);
        contentValues41.put(gamemaster_Table.answer_cols.answer_id, 6);
        sqLiteDatabase.insert(gamemaster_Table.answer_table, null, contentValues41);

        contentValues = new ContentValues();
        contentValues.put(gamemaster_Table.answer_cols.answer_id, 7);
        contentValues.put(gamemaster_Table.answer_cols.text, "Design Computer Systems and Components");
        contentValues.put(gamemaster_Table.answer_cols.score, 5);
        contentValues.put(gamemaster_Table.answer_cols.itRating, 0);
        contentValues.put(gamemaster_Table.answer_cols.isRating, 0);
        contentValues.put(gamemaster_Table.answer_cols.ceRating, 10);
        contentValues.put(gamemaster_Table.answer_cols.csRating, 0);
        sqLiteDatabase.insert(gamemaster_Table.answer_table, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(gamemaster_Table.answer_cols.answer_id, 7);
        contentValues.put(gamemaster_Table.answer_cols.text, "Design and implement software systems");
        contentValues.put(gamemaster_Table.answer_cols.score, 5);
        contentValues.put(gamemaster_Table.answer_cols.itRating, 0);
        contentValues.put(gamemaster_Table.answer_cols.isRating, 0);
        contentValues.put(gamemaster_Table.answer_cols.ceRating, 0);
        contentValues.put(gamemaster_Table.answer_cols.csRating, 10);
        sqLiteDatabase.insert(gamemaster_Table.answer_table, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(gamemaster_Table.answer_cols.answer_id, 7);
        contentValues.put(gamemaster_Table.answer_cols.text, "Design Computer Systems with a business focus");
        contentValues.put(gamemaster_Table.answer_cols.score, 5);
        contentValues.put(gamemaster_Table.answer_cols.itRating, 0);
        contentValues.put(gamemaster_Table.answer_cols.isRating, 10);
        contentValues.put(gamemaster_Table.answer_cols.ceRating, 0);
        contentValues.put(gamemaster_Table.answer_cols.csRating, 0);
        sqLiteDatabase.insert(gamemaster_Table.answer_table, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(gamemaster_Table.answer_cols.answer_id, 7);
        contentValues.put(gamemaster_Table.answer_cols.text, "Maintain infrastructure");
        contentValues.put(gamemaster_Table.answer_cols.score, 5);
        contentValues.put(gamemaster_Table.answer_cols.itRating, 10);
        contentValues.put(gamemaster_Table.answer_cols.isRating, 0);
        contentValues.put(gamemaster_Table.answer_cols.ceRating, 0);
        contentValues.put(gamemaster_Table.answer_cols.csRating, 0);
        sqLiteDatabase.insert(gamemaster_Table.answer_table, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(gamemaster_Table.answer_cols.answer_id, 8);
        contentValues.put(gamemaster_Table.answer_cols.text, "The money gained");
        contentValues.put(gamemaster_Table.answer_cols.score, 0);
        contentValues.put(gamemaster_Table.answer_cols.itRating, 5);
        contentValues.put(gamemaster_Table.answer_cols.isRating, 0);
        contentValues.put(gamemaster_Table.answer_cols.ceRating, 5);
        contentValues.put(gamemaster_Table.answer_cols.csRating, 5);
        sqLiteDatabase.insert(gamemaster_Table.answer_table, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(gamemaster_Table.answer_cols.answer_id, 8);
        contentValues.put(gamemaster_Table.answer_cols.text, "Same as profit");
        contentValues.put(gamemaster_Table.answer_cols.score, 0);
        contentValues.put(gamemaster_Table.answer_cols.itRating, 5);
        contentValues.put(gamemaster_Table.answer_cols.isRating, 0);
        contentValues.put(gamemaster_Table.answer_cols.ceRating, 5);
        contentValues.put(gamemaster_Table.answer_cols.csRating, 5);
        sqLiteDatabase.insert(gamemaster_Table.answer_table, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(gamemaster_Table.answer_cols.answer_id, 8);
        contentValues.put(gamemaster_Table.answer_cols.text, "The money coming in from selling stuff");
        contentValues.put(gamemaster_Table.answer_cols.score, 10);
        contentValues.put(gamemaster_Table.answer_cols.itRating, 0);
        contentValues.put(gamemaster_Table.answer_cols.isRating, 5);
        contentValues.put(gamemaster_Table.answer_cols.ceRating, 0);
        contentValues.put(gamemaster_Table.answer_cols.csRating, 0);
        sqLiteDatabase.insert(gamemaster_Table.answer_table, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(gamemaster_Table.answer_cols.answer_id, 8);
        contentValues.put(gamemaster_Table.answer_cols.text, "How much money the company is worth");
        contentValues.put(gamemaster_Table.answer_cols.score, 0);
        contentValues.put(gamemaster_Table.answer_cols.itRating, 5);
        contentValues.put(gamemaster_Table.answer_cols.isRating, 0);
        contentValues.put(gamemaster_Table.answer_cols.ceRating, 5);
        contentValues.put(gamemaster_Table.answer_cols.csRating, 5);
        sqLiteDatabase.insert(gamemaster_Table.answer_table, null, contentValues);

        //do an insert statement for each answer for each question
        sqLiteDatabase.execSQL(
                "create table " + gamemaster_Table.image_table +
                        "(" + gamemaster_Table.image_cols.leftAnswer +
                        "," + gamemaster_Table.image_cols.rightAnswer +
                        "," + gamemaster_Table.image_cols.leftCSRating +
                        "," + gamemaster_Table.image_cols.leftITRating +
                        "," + gamemaster_Table.image_cols.leftISRating +
                        "," + gamemaster_Table.image_cols.leftCERating +
                        "," + gamemaster_Table.image_cols.rightCSRating +
                        "," + gamemaster_Table.image_cols.rightITRating +
                        "," + gamemaster_Table.image_cols.rightISRating +
                        "," + gamemaster_Table.image_cols.rightCERating +
                        "," + gamemaster_Table.image_cols.imgID +
                        "," + gamemaster_Table.image_cols.answers_id +
                        ");"
        );

        ContentValues contentValues26 = new ContentValues();
        contentValues26.put(gamemaster_Table.image_cols.answers_id, 1);
        contentValues26.put(gamemaster_Table.image_cols.imgID, R.raw.code_image);
        contentValues26.put(gamemaster_Table.image_cols.leftAnswer, 10);
        contentValues26.put(gamemaster_Table.image_cols.leftCERating, 1);
        contentValues26.put(gamemaster_Table.image_cols.leftCSRating, 10);
        contentValues26.put(gamemaster_Table.image_cols.leftISRating, 0);
        contentValues26.put(gamemaster_Table.image_cols.leftITRating, 1);
        contentValues26.put(gamemaster_Table.image_cols.rightAnswer, 0);
        contentValues26.put(gamemaster_Table.image_cols.rightCSRating, 0);
        contentValues26.put(gamemaster_Table.image_cols.rightCERating, 4);
        contentValues26.put(gamemaster_Table.image_cols.rightITRating, 3);
        contentValues26.put(gamemaster_Table.image_cols.rightISRating, 7);
        sqLiteDatabase.insert(gamemaster_Table.image_table, null, contentValues26);

        ContentValues contentValues27 = new ContentValues();
        contentValues27.put(gamemaster_Table.image_cols.answers_id, 1);
        contentValues27.put(gamemaster_Table.image_cols.imgID, R.raw.hardware_image);
        contentValues27.put(gamemaster_Table.image_cols.leftAnswer, 0);
        contentValues27.put(gamemaster_Table.image_cols.leftCERating, 0);
        contentValues27.put(gamemaster_Table.image_cols.leftCSRating, 4);
        contentValues27.put(gamemaster_Table.image_cols.leftISRating, 6);
        contentValues27.put(gamemaster_Table.image_cols.leftITRating, 0);
        contentValues27.put(gamemaster_Table.image_cols.rightAnswer, 10);
        contentValues27.put(gamemaster_Table.image_cols.rightCSRating, 5);
        contentValues27.put(gamemaster_Table.image_cols.rightCERating, 8);
        contentValues27.put(gamemaster_Table.image_cols.rightITRating, 10);
        contentValues27.put(gamemaster_Table.image_cols.rightISRating, 0);
        sqLiteDatabase.insert(gamemaster_Table.image_table, null, contentValues27);


        ContentValues contentValues51 = new ContentValues();
        contentValues51.put(gamemaster_Table.image_cols.answers_id, 2);
        contentValues51.put(gamemaster_Table.image_cols.imgID, R.raw.casual_clothes);
        contentValues51.put(gamemaster_Table.image_cols.leftAnswer, 10);
        contentValues51.put(gamemaster_Table.image_cols.leftCERating, 1);
        contentValues51.put(gamemaster_Table.image_cols.leftCSRating, 10);
        contentValues51.put(gamemaster_Table.image_cols.leftISRating, 0);
        contentValues51.put(gamemaster_Table.image_cols.leftITRating, 1);
        contentValues51.put(gamemaster_Table.image_cols.rightAnswer, 0);
        contentValues51.put(gamemaster_Table.image_cols.rightCSRating, 0);
        contentValues51.put(gamemaster_Table.image_cols.rightCERating, 4);
        contentValues51.put(gamemaster_Table.image_cols.rightITRating, 3);
        contentValues51.put(gamemaster_Table.image_cols.rightISRating, 7);
        sqLiteDatabase.insert(gamemaster_Table.image_table, null, contentValues51);

        ContentValues contentValues52 = new ContentValues();
        contentValues52.put(gamemaster_Table.image_cols.answers_id, 2);
        contentValues52.put(gamemaster_Table.image_cols.imgID, R.raw.suit_clothes);
        contentValues52.put(gamemaster_Table.image_cols.leftAnswer, 10);
        contentValues52.put(gamemaster_Table.image_cols.leftCERating, 5);
        contentValues52.put(gamemaster_Table.image_cols.leftCSRating, 7);
        contentValues52.put(gamemaster_Table.image_cols.leftISRating, 6);
        contentValues52.put(gamemaster_Table.image_cols.leftITRating, 0);
        contentValues52.put(gamemaster_Table.image_cols.rightAnswer, 0);
        contentValues52.put(gamemaster_Table.image_cols.rightCSRating, 0);
        contentValues52.put(gamemaster_Table.image_cols.rightCERating, 5);
        contentValues52.put(gamemaster_Table.image_cols.rightITRating, 2);
        contentValues52.put(gamemaster_Table.image_cols.rightISRating, 8);
        sqLiteDatabase.insert(gamemaster_Table.image_table, null, contentValues52);


        ContentValues contentValues53 = new ContentValues();
        contentValues53.put(gamemaster_Table.image_cols.answers_id, 3);
        contentValues53.put(gamemaster_Table.image_cols.imgID, R.raw.big_business);
        contentValues53.put(gamemaster_Table.image_cols.leftAnswer, 10);
        contentValues53.put(gamemaster_Table.image_cols.leftCERating, 1);
        contentValues53.put(gamemaster_Table.image_cols.leftCSRating, 10);
        contentValues53.put(gamemaster_Table.image_cols.leftISRating, 0);
        contentValues53.put(gamemaster_Table.image_cols.leftITRating, 1);
        contentValues53.put(gamemaster_Table.image_cols.rightAnswer, 0);
        contentValues53.put(gamemaster_Table.image_cols.rightCSRating, 0);
        contentValues53.put(gamemaster_Table.image_cols.rightCERating, 4);
        contentValues53.put(gamemaster_Table.image_cols.rightITRating, 3);
        contentValues53.put(gamemaster_Table.image_cols.rightISRating, 7);
        sqLiteDatabase.insert(gamemaster_Table.image_table, null, contentValues53);

        ContentValues contentValues54 = new ContentValues();
        contentValues54.put(gamemaster_Table.image_cols.answers_id, 3);
        contentValues54.put(gamemaster_Table.image_cols.imgID, R.raw.small_business);
        contentValues54.put(gamemaster_Table.image_cols.leftAnswer, 10);
        contentValues54.put(gamemaster_Table.image_cols.leftCERating, 5);
        contentValues54.put(gamemaster_Table.image_cols.leftCSRating, 7);
        contentValues54.put(gamemaster_Table.image_cols.leftISRating, 6);
        contentValues54.put(gamemaster_Table.image_cols.leftITRating, 0);
        contentValues54.put(gamemaster_Table.image_cols.rightAnswer, 0);
        contentValues54.put(gamemaster_Table.image_cols.rightCSRating, 0);
        contentValues54.put(gamemaster_Table.image_cols.rightCERating, 5);
        contentValues54.put(gamemaster_Table.image_cols.rightITRating, 2);
        contentValues54.put(gamemaster_Table.image_cols.rightISRating, 8);
        sqLiteDatabase.insert(gamemaster_Table.image_table, null, contentValues54);

        ContentValues contentValues55 = new ContentValues();
        contentValues55.put(gamemaster_Table.image_cols.answers_id, 4);
        contentValues55.put(gamemaster_Table.image_cols.imgID, R.raw.front_end);
        contentValues55.put(gamemaster_Table.image_cols.leftAnswer, 10);
        contentValues55.put(gamemaster_Table.image_cols.leftCERating, 1);
        contentValues55.put(gamemaster_Table.image_cols.leftCSRating, 10);
        contentValues55.put(gamemaster_Table.image_cols.leftISRating, 0);
        contentValues55.put(gamemaster_Table.image_cols.leftITRating, 1);
        contentValues55.put(gamemaster_Table.image_cols.rightAnswer, 0);
        contentValues55.put(gamemaster_Table.image_cols.rightCSRating, 0);
        contentValues55.put(gamemaster_Table.image_cols.rightCERating, 4);
        contentValues55.put(gamemaster_Table.image_cols.rightITRating, 3);
        contentValues55.put(gamemaster_Table.image_cols.rightISRating, 7);
        sqLiteDatabase.insert(gamemaster_Table.image_table, null, contentValues55);

        ContentValues contentValues56 = new ContentValues();
        contentValues56.put(gamemaster_Table.image_cols.answers_id, 4);
        contentValues56.put(gamemaster_Table.image_cols.imgID, R.raw.back_end);
        contentValues56.put(gamemaster_Table.image_cols.leftAnswer, 10);
        contentValues56.put(gamemaster_Table.image_cols.leftCERating, 5);
        contentValues56.put(gamemaster_Table.image_cols.leftCSRating, 7);
        contentValues56.put(gamemaster_Table.image_cols.leftISRating, 6);
        contentValues56.put(gamemaster_Table.image_cols.leftITRating, 0);
        contentValues56.put(gamemaster_Table.image_cols.rightAnswer, 0);
        contentValues56.put(gamemaster_Table.image_cols.rightCSRating, 0);
        contentValues56.put(gamemaster_Table.image_cols.rightCERating, 5);
        contentValues56.put(gamemaster_Table.image_cols.rightITRating, 2);
        contentValues56.put(gamemaster_Table.image_cols.rightISRating, 8);
        sqLiteDatabase.insert(gamemaster_Table.image_table, null, contentValues56);
//~~








        sqLiteDatabase.execSQL(
                "create table " + gamemaster_Table.swipe_table +
                        "(" + gamemaster_Table.swipe_cols.textLeft +
                        "," + gamemaster_Table.swipe_cols.textRight + ", " +
                        gamemaster_Table.swipe_cols.answers_id + ", " +
                        gamemaster_Table.swipe_cols.fun + ", " +
                        gamemaster_Table.swipe_cols.focus +
                        ");"
        );

        ContentValues contentValues17 = new ContentValues();
        contentValues17.put(gamemaster_Table.swipe_cols.textLeft, "Software");
        contentValues17.put(gamemaster_Table.swipe_cols.textRight, "Hardware");
        contentValues17.put(gamemaster_Table.swipe_cols.answers_id, 1);
        contentValues17.put(gamemaster_Table.swipe_cols.fun, 2);
        contentValues17.put(gamemaster_Table.swipe_cols.focus, IT_FOCUS);
        sqLiteDatabase.insert(gamemaster_Table.swipe_table, null, contentValues17);

        contentValues17 = new ContentValues();
        contentValues17.put(gamemaster_Table.swipe_cols.textLeft, "Software");
        contentValues17.put(gamemaster_Table.swipe_cols.textRight, "Hardware");
        contentValues17.put(gamemaster_Table.swipe_cols.answers_id, 1);
        contentValues17.put(gamemaster_Table.swipe_cols.fun, 2);
        contentValues17.put(gamemaster_Table.swipe_cols.focus, CS_FOCUS);
        sqLiteDatabase.insert(gamemaster_Table.swipe_table, null, contentValues17);


        ContentValues contentValues101 = new ContentValues();
        contentValues101.put(gamemaster_Table.swipe_cols.textLeft, "Like");
        contentValues101.put(gamemaster_Table.swipe_cols.textRight, "Dislike");
        contentValues101.put(gamemaster_Table.swipe_cols.answers_id, 2);
        contentValues101.put(gamemaster_Table.swipe_cols.fun, 3);
        contentValues101.put(gamemaster_Table.swipe_cols.focus, CS_FOCUS);
        sqLiteDatabase.insert(gamemaster_Table.swipe_table, null, contentValues101);

        ContentValues contentValues100 = new ContentValues();
        contentValues100.put(gamemaster_Table.swipe_cols.textLeft, "Like");
        contentValues100.put(gamemaster_Table.swipe_cols.textRight, "Dislike");
        contentValues100.put(gamemaster_Table.swipe_cols.answers_id, 3);
        contentValues100.put(gamemaster_Table.swipe_cols.fun, 4);
        contentValues100.put(gamemaster_Table.swipe_cols.focus, CS_FOCUS);
        sqLiteDatabase.insert(gamemaster_Table.swipe_table, null, contentValues100);

        ContentValues contentValues50 = new ContentValues();
        contentValues50.put(gamemaster_Table.swipe_cols.textLeft, "Like");
        contentValues50.put(gamemaster_Table.swipe_cols.textRight, "Dislike");
        contentValues50.put(gamemaster_Table.swipe_cols.answers_id, 4);
        contentValues50.put(gamemaster_Table.swipe_cols.fun, 1);
        contentValues50.put(gamemaster_Table.swipe_cols.focus, CS_FOCUS);
        sqLiteDatabase.insert(gamemaster_Table.swipe_table, null, contentValues50);


        sqLiteDatabase.execSQL(
                "create table " + gamemaster_Table.ratequestion_table +
                        "(" + gamemaster_Table.ratequestion_cols.text +
                        "," + gamemaster_Table.ratequestion_cols.score +
                        "," + gamemaster_Table.ratequestion_cols.cs +
                        "," + gamemaster_Table.ratequestion_cols.it +
                        "," + gamemaster_Table.ratequestion_cols.is +
                        "," + gamemaster_Table.ratequestion_cols.ce + ", " +
                        gamemaster_Table.ratequestion_cols.fun + "," + gamemaster_Table.ratequestion_cols.focus +
                        ");"
        );

        ContentValues contentValues18 = new ContentValues();
        contentValues18.put(gamemaster_Table.ratequestion_cols.text, "How would you rate your math skills?");
        contentValues18.put(gamemaster_Table.ratequestion_cols.score, 6);
        contentValues18.put(gamemaster_Table.ratequestion_cols.cs, 7);
        contentValues18.put(gamemaster_Table.ratequestion_cols.it, 3);
        contentValues18.put(gamemaster_Table.ratequestion_cols.is, 0);
        contentValues18.put(gamemaster_Table.ratequestion_cols.ce, 10);
        contentValues18.put(gamemaster_Table.ratequestion_cols.fun, 1);
        contentValues18.put(gamemaster_Table.ratequestion_cols.focus, 1);
        sqLiteDatabase.insert(gamemaster_Table.ratequestion_table, null, contentValues18);

        ContentValues contentValues19 = new ContentValues();
        contentValues19.put(gamemaster_Table.ratequestion_cols.text, "How would you rate your critical thinking skills?'");
        contentValues19.put(gamemaster_Table.ratequestion_cols.score, 6);
        contentValues19.put(gamemaster_Table.ratequestion_cols.cs, 7);
        contentValues19.put(gamemaster_Table.ratequestion_cols.it, 3);
        contentValues19.put(gamemaster_Table.ratequestion_cols.is, 0);
        contentValues19.put(gamemaster_Table.ratequestion_cols.ce, 10);
        contentValues19.put(gamemaster_Table.ratequestion_cols.fun, 1);
        contentValues19.put(gamemaster_Table.ratequestion_cols.focus, 2);
        sqLiteDatabase.insert(gamemaster_Table.ratequestion_table, null, contentValues19);

        ContentValues contentValues20 = new ContentValues();
        contentValues20.put(gamemaster_Table.ratequestion_cols.text, "How often do you do you build technology related items?");
        contentValues20.put(gamemaster_Table.ratequestion_cols.score, 6);
        contentValues20.put(gamemaster_Table.ratequestion_cols.cs, 7);
        contentValues20.put(gamemaster_Table.ratequestion_cols.it, 3);
        contentValues20.put(gamemaster_Table.ratequestion_cols.is, 0);
        contentValues20.put(gamemaster_Table.ratequestion_cols.ce, 10);
        contentValues20.put(gamemaster_Table.ratequestion_cols.fun, 3);
        contentValues20.put(gamemaster_Table.ratequestion_cols.focus, 3);
        sqLiteDatabase.insert(gamemaster_Table.ratequestion_table, null, contentValues20);

        ContentValues contentValues21 = new ContentValues();
        contentValues21.put(gamemaster_Table.ratequestion_cols.text, "How often do you program computers?");
        contentValues21.put(gamemaster_Table.ratequestion_cols.score, 6);
        contentValues21.put(gamemaster_Table.ratequestion_cols.cs, 7);
        contentValues21.put(gamemaster_Table.ratequestion_cols.it, 3);
        contentValues21.put(gamemaster_Table.ratequestion_cols.is, 0);
        contentValues21.put(gamemaster_Table.ratequestion_cols.ce, 10);
        contentValues21.put(gamemaster_Table.ratequestion_cols.fun, 4);
        contentValues21.put(gamemaster_Table.ratequestion_cols.focus, 4);
        sqLiteDatabase.insert(gamemaster_Table.ratequestion_table, null, contentValues21);

        ContentValues contentValues33 = new ContentValues();
        contentValues33.put(gamemaster_Table.ratequestion_cols.text, "How much do you like dealing with People?");
        contentValues33.put(gamemaster_Table.ratequestion_cols.ce, 1);
        contentValues33.put(gamemaster_Table.ratequestion_cols.cs, 1);
        contentValues33.put(gamemaster_Table.ratequestion_cols.it, 8);
        contentValues33.put(gamemaster_Table.ratequestion_cols.is, 9);
        contentValues33.put(gamemaster_Table.ratequestion_cols.fun, 3);
        contentValues33.put(gamemaster_Table.ratequestion_cols.score, 6);
        contentValues33.put(gamemaster_Table.ratequestion_cols.focus, IT_FOCUS);
        sqLiteDatabase.insert(gamemaster_Table.ratequestion_table, null, contentValues33);

        ContentValues contentValues34 = new ContentValues();
        contentValues34.put(gamemaster_Table.ratequestion_cols.text, "How much do you like like dealing with Business?");
        contentValues34.put(gamemaster_Table.ratequestion_cols.fun, 4);
        contentValues34.put(gamemaster_Table.ratequestion_cols.focus, IT_FOCUS);
        contentValues34.put(gamemaster_Table.ratequestion_cols.score, 6);
        contentValues34.put(gamemaster_Table.ratequestion_cols.ce, 1);
        contentValues34.put(gamemaster_Table.ratequestion_cols.cs, 1);
        contentValues34.put(gamemaster_Table.ratequestion_cols.is, 10);
        contentValues34.put(gamemaster_Table.ratequestion_cols.it, 9);
        sqLiteDatabase.insert(gamemaster_Table.ratequestion_table, null, contentValues34);

        contentValues34 = new ContentValues();
        contentValues34.put(gamemaster_Table.ratequestion_cols.text, "How much do you like like dealing with Business?");
        contentValues34.put(gamemaster_Table.ratequestion_cols.fun, 4);
        contentValues34.put(gamemaster_Table.ratequestion_cols.focus, IS_FOCUS);
        contentValues34.put(gamemaster_Table.ratequestion_cols.score, 6);
        contentValues34.put(gamemaster_Table.ratequestion_cols.ce, 1);
        contentValues34.put(gamemaster_Table.ratequestion_cols.cs, 1);
        contentValues34.put(gamemaster_Table.ratequestion_cols.is, 10);
        contentValues34.put(gamemaster_Table.ratequestion_cols.it, 9);
        sqLiteDatabase.insert(gamemaster_Table.ratequestion_table, null, contentValues34);

        ContentValues contentValues35 = new ContentValues();
        contentValues35.put(gamemaster_Table.ratequestion_cols.text, "How detail oriented are you?");
        contentValues35.put(gamemaster_Table.ratequestion_cols.fun, 2);
        contentValues35.put(gamemaster_Table.ratequestion_cols.focus, CE_FOCUS);
        contentValues35.put(gamemaster_Table.ratequestion_cols.score, 6);
        contentValues35.put(gamemaster_Table.ratequestion_cols.ce, 10);
        contentValues35.put(gamemaster_Table.ratequestion_cols.cs, 7);
        contentValues35.put(gamemaster_Table.ratequestion_cols.is, 4);
        contentValues35.put(gamemaster_Table.ratequestion_cols.it, 0);
        sqLiteDatabase.insert(gamemaster_Table.ratequestion_table, null, contentValues35);

        ContentValues contentValues36 = new ContentValues();
        contentValues36.put(gamemaster_Table.ratequestion_cols.text, "Rate your problem solving skills?");
        contentValues36.put(gamemaster_Table.ratequestion_cols.fun, 3);
        contentValues36.put(gamemaster_Table.ratequestion_cols.focus, CE_FOCUS);
        contentValues36.put(gamemaster_Table.ratequestion_cols.score, 6);
        contentValues36.put(gamemaster_Table.ratequestion_cols.ce, 10);
        contentValues36.put(gamemaster_Table.ratequestion_cols.cs, 9);
        contentValues36.put(gamemaster_Table.ratequestion_cols.is, 5);
        contentValues36.put(gamemaster_Table.ratequestion_cols.it, 1);
        sqLiteDatabase.insert(gamemaster_Table.ratequestion_table, null, contentValues36);

        ContentValues contentValues42 = new ContentValues();
        contentValues42.put(gamemaster_Table.ratequestion_cols.text, "How hands on are you?");
        contentValues42.put(gamemaster_Table.ratequestion_cols.fun, 4);
        contentValues42.put(gamemaster_Table.ratequestion_cols.focus, CE_FOCUS);
        contentValues42.put(gamemaster_Table.ratequestion_cols.score, 6);
        contentValues42.put(gamemaster_Table.ratequestion_cols.ce, 10);
        contentValues42.put(gamemaster_Table.ratequestion_cols.cs, 0);
        contentValues42.put(gamemaster_Table.ratequestion_cols.is, 0);
        contentValues42.put(gamemaster_Table.ratequestion_cols.it, 8);
        sqLiteDatabase.insert(gamemaster_Table.ratequestion_table, null, contentValues42);

        contentValues = new ContentValues();
        contentValues.put(gamemaster_Table.ratequestion_cols.fun, 1);
        contentValues.put(gamemaster_Table.ratequestion_cols.focus, IS_FOCUS);
        contentValues.put(gamemaster_Table.ratequestion_cols.text, "Are you good in dealing with money?");
        contentValues.put(gamemaster_Table.ratequestion_cols.is, 10);
        contentValues.put(gamemaster_Table.ratequestion_cols.ce, 0);
        contentValues.put(gamemaster_Table.ratequestion_cols.cs, 0);
        contentValues.put(gamemaster_Table.ratequestion_cols.it, 0);
        contentValues.put(gamemaster_Table.ratequestion_cols.score, 6);
        sqLiteDatabase.insert(gamemaster_Table.ratequestion_table, null, contentValues);


        sqLiteDatabase.execSQL(
                "create table " + gamemaster_Table.textquestion_table +
                        "(" + gamemaster_Table.textquestion_cols.text +
                        "," + gamemaster_Table.textquestion_cols.answer_id + ", " +
                        gamemaster_Table.textquestion_cols.fun + ", " + gamemaster_Table.textquestion_cols.focus +
                        ");"
        );


        ContentValues contentValues22 = new ContentValues();
        contentValues22.put(gamemaster_Table.textquestion_cols.text, "Which one of these are not a programming language?");
        contentValues22.put(gamemaster_Table.textquestion_cols.answer_id, 1);
        contentValues22.put(gamemaster_Table.textquestion_cols.fun, 1);
        contentValues22.put(gamemaster_Table.textquestion_cols.focus, 1);
        sqLiteDatabase.insert(gamemaster_Table.textquestion_table, null, contentValues22);


        ContentValues contentValues23 = new ContentValues();
        contentValues23.put(gamemaster_Table.textquestion_cols.text, "Which one of these are not an Operating System?");
        contentValues23.put(gamemaster_Table.textquestion_cols.answer_id, 2);
        contentValues23.put(gamemaster_Table.textquestion_cols.fun, 2);
        contentValues23.put(gamemaster_Table.textquestion_cols.focus, 3);
        sqLiteDatabase.insert(gamemaster_Table.textquestion_table, null, contentValues23);

        ContentValues contentValues24 = new ContentValues();
        contentValues24.put(gamemaster_Table.textquestion_cols.text, "Would you rather work with the hardware or the software components of a computer?");
        contentValues24.put(gamemaster_Table.textquestion_cols.answer_id, 3);
        contentValues24.put(gamemaster_Table.textquestion_cols.fun, 3);
        contentValues24.put(gamemaster_Table.textquestion_cols.focus, 4);
        sqLiteDatabase.insert(gamemaster_Table.textquestion_table, null, contentValues24);

        ContentValues contentValues25 = new ContentValues();
        contentValues25.put(gamemaster_Table.textquestion_cols.text, "____ is the area of a computer that temporarily holds data that is waiting to be processed, stored, or output?");
        contentValues25.put(gamemaster_Table.textquestion_cols.answer_id, 4);
        contentValues25.put(gamemaster_Table.textquestion_cols.fun, 4);
        contentValues25.put(gamemaster_Table.textquestion_cols.focus, 2);
        sqLiteDatabase.insert(gamemaster_Table.textquestion_table, null, contentValues25);

        ContentValues contentValues28 = new ContentValues();
        contentValues28.put(gamemaster_Table.textquestion_cols.text, "Which major would you choose?");
        contentValues28.put(gamemaster_Table.textquestion_cols.answer_id, 5);
        contentValues28.put(gamemaster_Table.textquestion_cols.focus, 1);
        contentValues28.put(gamemaster_Table.textquestion_cols.fun, 0);
        sqLiteDatabase.insert(gamemaster_Table.textquestion_table, null, contentValues28);

        ContentValues contentValues37 = new ContentValues();
        contentValues37.put(gamemaster_Table.textquestion_cols.text, "What would you like to work with?");
        contentValues37.put(gamemaster_Table.textquestion_cols.focus, IT_FOCUS);
        contentValues37.put(gamemaster_Table.textquestion_cols.fun, 1);
        contentValues37.put(gamemaster_Table.textquestion_cols.answer_id, 6);
        sqLiteDatabase.insert(gamemaster_Table.textquestion_table, null, contentValues37);

        contentValues = new ContentValues();
        contentValues.put(gamemaster_Table.textquestion_cols.text, "What sounds most appealing to you?");
        contentValues.put(gamemaster_Table.textquestion_cols.focus, IS_FOCUS);
        contentValues.put(gamemaster_Table.textquestion_cols.fun, 2);
        contentValues.put(gamemaster_Table.textquestion_cols.answer_id, 7);
        sqLiteDatabase.insert(gamemaster_Table.textquestion_table, null, contentValues);

        contentValues = new ContentValues();
        contentValues.put(gamemaster_Table.textquestion_cols.text, "What is revenue?");
        contentValues.put(gamemaster_Table.textquestion_cols.fun, 3);
        contentValues.put(gamemaster_Table.textquestion_cols.focus, IS_FOCUS);
        contentValues.put(gamemaster_Table.textquestion_cols.answer_id, 8);
        sqLiteDatabase.insert(gamemaster_Table.textquestion_table, null, contentValues);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
