package Set6;

import java.text.DecimalFormat;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

class VotingMachine {
    private DecimalFormat df = new DecimalFormat("0.00");
    private LinkedHashMap<String, Integer> candidates = new LinkedHashMap<>();

    LinkedHashMap<String, Integer> getCandidates() {
        return candidates;
    }

    void addCandidate(String name) {
        candidates.put(name, 0);
    }

    void castVote(String name) {
        if (candidates.containsKey(name))
            candidates.merge(name, 1, Integer::sum);
    }

    int getTotalVotesFor(String name) {
        return candidates.get(name);
    }

    void getAllTotalVotes() {
        for(Map.Entry<String, Integer> entry : candidates.entrySet())
            System.out.printf("%-15s %10d\n", entry.getKey() + ":", getTotalVotesFor(entry.getKey()));
    }

    String getWinner() {
        return Collections.max(candidates.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    void display() {
        for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
            double percent = ((double)(entry.getValue()) / candidates.size()) * 100;
            System.out.printf("%-15s %9s%%\n", entry.getKey() + ":", df.format(percent));
        }

    }
}
