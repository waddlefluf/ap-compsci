package Set6;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        /*
        Path path = new Path();

        path.addPoint(0,0);
        path.addPoint(0,10);
        path.addPoint(10,10);
        path.addPoint(10,0);
        path.addPoint(0,0);

        System.out.println(path.getLength());

         */

        /*
         * these tests are for the first version of the voting machine that uses
         * candidate0, candidate1, etc. rather than names.
         */

        VotingMachineOld vote = new VotingMachineOld(5);

        // System.out.println(vote.candidates);

        vote.castVote(0);
        vote.castVote(0);
        vote.castVote(1);
        vote.castVote(4);
        vote.castVote(5);
        vote.castVote(3);

        // System.out.println(vote.candidates);
        System.out.println("Old voting machine (use nums instead of names):\n");

        System.out.println("Votes for candidate 0:\t" + vote.getTotalVotesFor(0));
        System.out.printf("\nWinner:%19s\n", vote.getWinner());

        vote.display();

        // updated VotingMachine:

        VotingMachine machine = new VotingMachine();

        /*
         * these tests are for the updated version of the voting machine that uses
         * names instead of numbers for candidates
         */

        System.out.println("\n\nUpdated voting machine (using names):\n");

        machine.addCandidate("Person");;
        machine.addCandidate("Luigi");
        machine.addCandidate("Mario");
        machine.addCandidate("Someone");
        machine.addCandidate("b");

        machine.castVote("Person");
        machine.castVote("Nobody"); // does nothing since "Nobody" is not a candidate
        machine.castVote("b");
        machine.castVote("b");
        machine.castVote("Luigi");
        machine.castVote("Luigi");
        machine.castVote("Luigi");
        machine.castVote("Someone");

        for (Map.Entry<String, Integer> entry : machine.getCandidates().entrySet())
            // loop through candidates and print how many votes each got (tester for getTotalVotesFor)
            System.out.printf("%-15s %10d\n", entry.getKey() + ":", machine.getTotalVotesFor(entry.getKey()));

        System.out.printf("\nWinner:%19s\n\n", machine.getWinner());

        machine.display();
    }
}
