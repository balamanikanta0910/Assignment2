import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

class cumulative_poetryTest {
    @Test
    public void recite() {
        cumulative_poetry cup = new cumulative_poetry();
        String str="\n" +
                "Day 1 -\n" +
                "This is the house that Jack built.\n" +
                "\n" +
                "Day 2 -\n" +
                "This is the malth that lay in\n" +
                "\tthe house that Jack built.\n" +
                "\n" +
                "Day 3 -\n" +
                "This is the rat that ate\n" +
                "\tthe malth that lay in\n" +
                "\tthe house that Jack built.\n" +
                "\n" +
                "Day 4 -\n" +
                "This is the cat that killed\n" +
                "\tthe rat that ate\n" +
                "\tthe malth that lay in\n" +
                "\tthe house that Jack built.\n" +
                "\n" +
                "Day 5 -\n" +
                "This is the dog that worried\n" +
                "\tthe cat that killed\n" +
                "\tthe rat that ate\n" +
                "\tthe malth that lay in\n" +
                "\tthe house that Jack built.\n" +
                "\n" +
                "Day 6 -\n" +
                "This is the cow with the crumpled horn that tossed\n" +
                "\tthe dog that worried\n" +
                "\tthe cat that killed\n" +
                "\tthe rat that ate\n" +
                "\tthe malth that lay in\n" +
                "\tthe house that Jack built.\n" +
                "\n" +
                "Day 7 -\n" +
                "This is the maiden all forlorn that milked\n" +
                "\tthat cow with the crumpled horn that tossed\n" +
                "\tthe dog that worried\n" +
                "\tthe cat that killed\n" +
                "\tthe rat that ate\n" +
                "\tthe malth that lay in\n" +
                "\tthe house that Jack built.\n" +
                "\n" +
                "Day 8 -\n" +
                "This is the man all tattered and torn that kissed\n" +
                "\tthe maiden all forlorn that milked\n" +
                "\tthat cow with the crumpled horn that tossed\n" +
                "\tthe dog that worried\n" +
                "\tthe cat that killed\n" +
                "\tthe rat that ate\n" +
                "\tthe malth that lay in\n" +
                "\tthe house that Jack built.\n" +
                "\n" +
                "Day 9 -\n" +
                "This is the priest all shaven and shorn that married\n" +
                "\tthe man all tattered and torn that kissed\n" +
                "\tthe maiden all forlorn that milked\n" +
                "\tthat cow with the crumpled horn that tossed\n" +
                "\tthe dog that worried\n" +
                "\tthe cat that killed\n" +
                "\tthe rat that ate\n" +
                "\tthe malth that lay in\n" +
                "\tthe house that Jack built.\n" +
                "\n" +
                "Day 10 -\n" +
                "This is the rooster that crowed in the morn that woke\n" +
                "\tthe priest all shaven and shorn that married\n" +
                "\tthe man all tattered and torn that kissed\n" +
                "\tthe maiden all forlorn that milked\n" +
                "\tthat cow with the crumpled horn that tossed\n" +
                "\tthe dog that worried\n" +
                "\tthe cat that killed\n" +
                "\tthe rat that ate\n" +
                "\tthe malth that lay in\n" +
                "\tthe house that Jack built.\n" +
                "\n" +
                "Day 11 -\n" +
                "This is the farmer sowing his corn that kept\n" +
                "\tthe rooster that crowed in the morn that woke\n" +
                "\tthe priest all shaven and shorn that married\n" +
                "\tthe man all tattered and torn that kissed\n" +
                "\tthe maiden all forlorn that milked\n" +
                "\tthat cow with the crumpled horn that tossed\n" +
                "\tthe dog that worried\n" +
                "\tthe cat that killed\n" +
                "\tthe rat that ate\n" +
                "\tthe malth that lay in\n" +
                "\tthe house that Jack built.\n" +
                "\n" +
                "Day 12 -\n" +
                "This is the horse and the hound and the horn that belonged to\n" +
                "\tthe farmer sowing his corn that kept\n" +
                "\tthe rooster that crowed in the morn that woke\n" +
                "\tthe priest all shaven and shorn that married\n" +
                "\tthe man all tattered and torn that kissed\n" +
                "\tthe maiden all forlorn that milked\n" +
                "\tthat cow with the crumpled horn that tossed\n" +
                "\tthe dog that worried\n" +
                "\tthe cat that killed\n" +
                "\tthe rat that ate\n" +
                "\tthe malth that lay in\n" +
                "\tthe house that Jack built.\n";
        assertEquals(cup.recite(),str);
    }

    @Test
    public void reveal() {
        cumulative_poetry cup=new cumulative_poetry();
        String str="This is the rat that ate\n" +
                "\tthe malth that lay in\n" +
                "\tthe house that Jack built.\n";
        assertEquals(cup.reveal(5),str);
    }


}