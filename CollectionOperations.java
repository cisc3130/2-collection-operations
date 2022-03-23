import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.ArrayList;

/* This code takes the GDP of states from https://worldpopulationreview.com/state-rankings/gdp-by-state
   and takes the count of states whose GDP is greater than $100,000 in terms of millions. (1 trillion)
 */
public class CollectionOperations {
    class State {
        int GDP;
        String name;

        public State(String name, int GDP) {
            this.name = name;
            this.GDP = GDP;
        }

        public int getGDP() {
            return GDP;
        }

        public String getName() {
            return name;
        }
    }

    List<State> States;

    public CollectionOperations() throws FileNotFoundException {
        Scanner input = new Scanner(new File("GDP by State 2021-2022"));
        States = new ArrayList<>(50);

        while (input.hasNext()) {
            States.add(new State(input.next(), input.nextInt())); // adds the values from the text file into the array list.
        }
    }

    public static void main (String[] args) throws FileNotFoundException {
        CollectionOperations co = new CollectionOperations();
        System.out.println("foreachlooptask: " + co.forEachLoopTask());
        System.out.println("iteratorlooptask: " + co.iteratorLoopTask());
        System.out.println("streamtask: " + co.streamTask());
    }

    public int forEachLoopTask() {
        int count = 0;
        for (State s: States) {
            if (s.getGDP() > 100000) {
                count++;
            }
        }
        return count;
    }

    public int iteratorLoopTask() {
        Iterator<State> st = States.iterator();
        int count = 0;
        while (st.hasNext()) {
            State s = st.next();
            if (s.getGDP() > 100000) {
                count++;
            }
        }
        return count;
    }

    public int streamTask() {
        return (int) States.stream()
                .mapToInt(State::getGDP)
                .filter(x -> x > 100000)
                .count();
    }
}
/* Lines of code
   forEachLoop: Lines 46-54 (8 lines)
   iteratorLoop: Lines 56-66 (10 lines)
   streamTask: Lines 68-73 (5 lines)

   The stream method was best suited in my opinion because of how fast it is to write
   and how easy it is to understand. While it is hard to get used to, it's filled with
   many methods that would be useful to find specific parts when looking around data.
 */