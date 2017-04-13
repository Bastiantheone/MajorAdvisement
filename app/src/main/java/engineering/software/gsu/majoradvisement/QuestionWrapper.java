package engineering.software.gsu.majoradvisement;


import android.database.Cursor;
import android.database.CursorWrapper;

public class QuestionWrapper extends CursorWrapper {


    public QuestionWrapper(Cursor cursor) {
        super(cursor);
    }

    public Answer getAnswer() {
        String text = getString(getColumnIndex(QuestionDbSchema.gamemaster_Table.answer_cols.text));
        int score = getInt(getColumnIndex(QuestionDbSchema.gamemaster_Table.answer_cols.score));
        int csRating = getInt(getColumnIndex(QuestionDbSchema.gamemaster_Table.answer_cols.csRating));
        int itRating = getInt(getColumnIndex(QuestionDbSchema.gamemaster_Table.answer_cols.itRating));
        int isRating = getInt(getColumnIndex(QuestionDbSchema.gamemaster_Table.answer_cols.isRating));
        int ceRating = getInt(getColumnIndex(QuestionDbSchema.gamemaster_Table.answer_cols.ceRating));

        Answer answer1 = new Answer(text, score, csRating, itRating, isRating, ceRating);
        return answer1;
    }


    public GMHolder getGameMaster() {
        String user_name = getString(getColumnIndex(QuestionDbSchema.gamemaster_Table.GameMasterCols.user_name));
        String password = getString(getColumnIndex(QuestionDbSchema.gamemaster_Table.GameMasterCols.password));
        int fun = getInt(getColumnIndex(QuestionDbSchema.gamemaster_Table.GameMasterCols.fun));
        int global_score = getInt(getColumnIndex(QuestionDbSchema.gamemaster_Table.GameMasterCols.global_score));
        int global_cs_score = getInt(getColumnIndex(QuestionDbSchema.gamemaster_Table.GameMasterCols.global_cs_score));
        int global_it_score = getInt(getColumnIndex(QuestionDbSchema.gamemaster_Table.GameMasterCols.global_it_score));
        int global_is_score = getInt(getColumnIndex(QuestionDbSchema.gamemaster_Table.GameMasterCols.global_is_score));
        int global_ce_score = getInt(getColumnIndex(QuestionDbSchema.gamemaster_Table.GameMasterCols.global_ce_score));

        return new GMHolder(global_score,global_cs_score,global_ce_score,global_it_score,global_is_score,fun,user_name,password);
    }

    public Image images() {
        int imgIDs = getInt(getColumnIndex(QuestionDbSchema.gamemaster_Table.image_cols.imgID));
        int leftScore = getInt(getColumnIndex(QuestionDbSchema.gamemaster_Table.image_cols.leftAnswer));

        int leftCSRating = getInt(getColumnIndex(QuestionDbSchema.gamemaster_Table.image_cols.leftCSRating));
        int leftITRating = getInt(getColumnIndex(QuestionDbSchema.gamemaster_Table.image_cols.leftITRating));
        int leftISRating = getInt(getColumnIndex(QuestionDbSchema.gamemaster_Table.image_cols.leftISRating));
        int leftCERating = getInt(getColumnIndex(QuestionDbSchema.gamemaster_Table.image_cols.leftCERating));

        int rightScore = getInt(getColumnIndex(QuestionDbSchema.gamemaster_Table.image_cols.rightAnswer));
        int rightCSRating = getInt(getColumnIndex(QuestionDbSchema.gamemaster_Table.image_cols.rightCSRating));
        int rightITRating = getInt(getColumnIndex(QuestionDbSchema.gamemaster_Table.image_cols.rightITRating));
        int rightISRating = getInt(getColumnIndex(QuestionDbSchema.gamemaster_Table.image_cols.rightISRating));
        int rightCERating = getInt(getColumnIndex(QuestionDbSchema.gamemaster_Table.image_cols.rightCERating));


        Image images1 = new Image(imgIDs, leftScore, leftCSRating, leftITRating, leftISRating, leftCERating,
                rightScore, rightCSRating, rightITRating, rightISRating, rightCERating);

        return images1;
    }

    public SwipeActivity swipey() {
        String text_left = getString(getColumnIndex(QuestionDbSchema.gamemaster_Table.swipe_cols.textLeft));
        String text_right = getString(getColumnIndex(QuestionDbSchema.gamemaster_Table.swipe_cols.textRight));

        //SwipeQuestion swipey1 = new SwipeQuestion(text_left,text_right);
        //swipey1.getTextLeft();
        //swipey1.getTextRight();
        SwipeActivity swipey1 = new SwipeActivity();
        return swipey1;
    }

    public RateQuestion ratey() {
        String text_rate = getString(getColumnIndex(QuestionDbSchema.gamemaster_Table.ratequestion_cols.text));
        int score = getInt(getColumnIndex(QuestionDbSchema.gamemaster_Table.ratequestion_cols.score));
        int cs = getInt(getColumnIndex(QuestionDbSchema.gamemaster_Table.ratequestion_cols.cs));
        int it = getInt(getColumnIndex(QuestionDbSchema.gamemaster_Table.ratequestion_cols.it));
        int is = getInt(getColumnIndex(QuestionDbSchema.gamemaster_Table.ratequestion_cols.is));
        int ce = getInt(getColumnIndex(QuestionDbSchema.gamemaster_Table.ratequestion_cols.ce));
        int fun = getInt(getColumnIndex(QuestionDbSchema.gamemaster_Table.ratequestion_cols.fun));

        RateQuestion ratey1 = new RateQuestion(text_rate, score, cs, it, is, ce, fun);

        return ratey1;
    }

    public TextQuestion texty() {
        String text_text = getString(getColumnIndex(QuestionDbSchema.gamemaster_Table.textquestion_cols.text));
        int fun = getInt(getColumnIndex(QuestionDbSchema.gamemaster_Table.textquestion_cols.fun));
        int answer_id = getInt(getColumnIndex(QuestionDbSchema.gamemaster_Table.textquestion_cols.answer_id));

        TextQuestion texty1 = new TextQuestion(text_text, fun,  answer_id);

        return texty1;
    }


}


