package engineering.software.gsu.majoradvisement;

/**
 * Created by KidKen on 4/11/2017.
 */

public class QuestionDbSchema {


    public static final class gamemaster_Table {
        public static final String game_master_table = "game_master";
        public static final String answer_table = "answer_table";
        public static final String image_table = "image_table";
        public static final String swipe_table = "swipe_table";
        public static final String ratequestion_table = "ratequestion_table";
        public static final String textquestion_table = "textquestion_table";


        public static final class GameMasterCols {

            public static final String user_name = "user_name";
            public static final String password = "password";
            public static final String fun = "fun";
            public static final String global_score = "global_score";
            public static final String global_cs_score = "global_cs_";
            public static final String global_it_score = "global_it_score";
            public static final String global_is_score = "global_is_score";
            public static final String global_ce_score = "global_ce_score";
        }

        public static final class answer_cols {
            public static final String text = "text";
            public static final String score = "score";
            public static final String csRating = "csRating";
            public static final String itRating = "itRating";
            public static final String isRating = "isRating";
            public static final String ceRating = "ceRating";
            public static final String answer_id = "answer_id";
        }

        public static final class image_cols {
            public static final String imgID = "imgID";
            public static final String leftAnswer = "leftAnswer";
            public static final String leftCSRating = "leftCSRating";
            public static final String leftITRating = "leftITRating";
            public static final String leftISRating = "leftISRating";
            public static final String leftCERating = "leftCERating";

            public static final String rightAnswer = "rightAnswer";
            public static final String rightCSRating = "rightCSRating";
            public static final String rightITRating = "rightITRating";
            public static final String rightISRating = "rightISRating";
            public static final String rightCERating = "rightCERating";
            public static final String answers_id = "answers_id";

            //Maybe finished IDK yet check back in the Image.java class
        }

        public static final class swipe_cols {
            public static final String textLeft = "textLeft";
            public static final String textRight = "textRight";
            public static final String fun = "fun";
            public static final String answer_id = "answers_id";
            public static final String focus = "focus";
        }

        public static final class ratequestion_cols {
            public static final String text = "text";
            public static final String score = "score";
            public static final String cs = "cs";
            public static final String it = "it";
            public static final String is = "is";
            public static final String ce = "ce";
            public static final String fun = "fun";
            public static final String focus = "focus";
        }

        public static final class textquestion_cols {
            public static final String text = "text";
            public static final String answer_id = "answers_id";
            public static final String fun = "fun";
            public static final String focus = "focus";
        }


    }

}
