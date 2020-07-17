package Set6;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class VotingMachine {
    /* possibly use associative array/hash map to assign nums to candidates */
    LinkedHashMap<String, Integer> candidates = new LinkedHashMap<>();
    int candidatesNum;

    VotingMachine(int candidatesNum) {
        this.candidatesNum = candidatesNum;

        for (int i = 0; i < candidatesNum; i++) {
            candidates.put("candidate" + i, 0);
        }
    }

    void castVote(int n) {
        if (n <= candidatesNum && n >= 0)
            candidates.merge("candidate" + n, 1, Integer::sum);
    }

    int getTotalVotesFor(int n) {
        if (n <= candidatesNum && n >= 0)
            return candidates.get("candidate" + n);
        else
            return 0;
    }

    String getWinner() {
        return Collections.max(candidates.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    void display() {
        for (int i = 0; i < candidatesNum; i++) {
            double percent = ((double)(candidates.get("candidate" + i)) / candidatesNum) * 100;
            System.out.println("Candidate " + i + ":\t" + percent + "%");
        }

    }
}
