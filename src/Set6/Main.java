package Set6;

public class Main {
    public static void main(String[] args) {
        // 1. (pre-object version)

        /*
        ArrayList<Point> path = new ArrayList<>();

        path.add(new Point(0,0));
        path.add(new Point(0,10));
        path.add(new Point(10,10));
        path.add(new Point(10,0));
        path.add(new Point(0,0));

        System.out.println(pathLength(path));
        */

        /*
        Path path = new Path();

        path.addPoint(0,0);
        path.addPoint(0,10);
        path.addPoint(10,10);
        path.addPoint(10,0);
        path.addPoint(0,0);

        System.out.println(path.getLength());

        VotingMachine vote = new VotingMachine();
        vote.castVote(1);
        vote.castVote(0);
        vote.castVote(0);

        System.out.println(vote.getTotalVotes(0));
        System.out.println(vote.getTotalVotes(1));
        System.out.println(vote.getTotalVotes(2));
        System.out.println(vote.getWinner());
        */

        VotingMachine vote = new VotingMachine(5);

        // System.out.println(vote.candidates);

        vote.castVote(0);
        vote.castVote(0);
        vote.castVote(1);
        vote.castVote(4);
        vote.castVote(5);
        vote.castVote(3);

        // System.out.println(vote.candidates);

        System.out.println("Votes for candidate 0:\t" + vote.getTotalVotesFor(0));

        System.out.println("Winner:\t" + vote.getWinner());

        vote.display();


    }

    /*
    static double pathLength(ArrayList<Point> path) {
        // 1. (pre-object version)

        double length = 0;

        for (int i = 0; i < path.size()-1; i++) {
            Point p1 = path.get(i);
            Point p2 = path.get(i+1);
            length += p1.distanceTo(p2);
        }

        return length;
    }
    */

}
