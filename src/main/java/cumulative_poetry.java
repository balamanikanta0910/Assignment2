public class cumulative_poetry {

        static String[] Data = {
                "the house that Jack built.",
                "the malth that lay in",
                "the rat that ate",
                "the cat that killed",
                "the dog that worried",
                "that cow with the crumpled horn that tossed",
                "the maiden all forlorn that milked",
                "the man all tattered and torn that kissed",
                "the priest all shaven and shorn that married",
                "the rooster that crowed in the morn that woke",
                "the farmer sowing his corn that kept",
                "the horse and the hound and the horn that belonged to"
        };

        static  String init = "This is ";

        public String recite()
        {
            String rec = "";

            for(int i=1; i<=12; i++)
            {
                rec += "\n" + "Day "+i+"-\n"+reveal(i);
            }

            return rec;
        }

        public String reveal(int day)
        {
            String res = "This is ";

            for(int i=day-1; i>=0; i--)
            {
                res += Data[i] +"\n" +"\t";
            }

            return res;
        }

        public static void main(String args[])
        {
            cumulative_poetry c = new cumulative_poetry();

            String op = new String();

            if(args[0].equals("--reveal-for-day"))
            {
                op = c.reveal(Integer.parseInt(args[1]));
            }
            else if(args[0].equals("--recite"))
            {
                op = c.recite();
            }

            System.out.println(op);
        }
}
