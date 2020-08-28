package Summer2020.Set6;

import Summer2020.Set4.Point;

public class Main {
    public static void main(String[] args) {
        Path path = new Path();

        path.addPoint(0, 0);
        path.addPoint(0, 10);
        path.addPoint(10, 10);
        path.addPoint(10, 0);
        path.addPoint(0, 0);

        System.out.printf("Path Length:%27s\n", path.getLength());
        System.out.printf("Point 3:%31s\n", path.getPoint(3));

        System.out.printf("getPoint   (3):%24s\n", path.getPoint(3));
        System.out.printf("getPoint (-10):%24s\n", path.getPoint(-10));
        System.out.printf("getPoint (999):%24s\n", path.getPoint(999));

        Point p1 = new Point(2,5);

        System.out.printf("getLocationAtPercent (50%%):%12s\n",  p1.getLocationAtPercent(50, new Point(3, 7)));

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
        System.out.println("\nOld voting machine (use nums instead of names):\n");

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

        machine.addCandidate("Person");
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

        machine.getAllTotalVotes();

        /*for (Map.Entry<String, Integer> entry : machine.getCandidates().entrySet())
            // loop through candidates and print how many votes each got (tester for getTotalVotesFor)
            System.out.printf("%-15s %10d\n", entry.getKey() + ":", machine.getTotalVotesFor(entry.getKey()));*/

        System.out.printf("\nWinner:%19s\n\n", machine.getWinner());

        machine.display();
    }
}