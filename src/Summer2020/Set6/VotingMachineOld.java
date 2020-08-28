package Summer2020.Set6;

import java.text.DecimalFormat;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

class VotingMachineOld {
    private DecimalFormat df = new DecimalFormat("0.00");
    LinkedHashMap<String, Integer> candidates = new LinkedHashMap<>();
    int candidatesNum;

    VotingMachineOld(int candidatesNum) {
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
            // System.out.println("Candidate " + i + ":\t" + percent + "%");
            System.out.printf("%-15s %9s%%\n", "Candidate " + i, df.format(percent));
        }

    }
}
