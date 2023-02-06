import java.util.*;

public class Bowling {
    HashMap<String, Integer> players;
    Bowling() {
        players = new HashMap<String, Integer>();
    }
    public void addPlayer(String name, int p) {
        players.put(name, p);
    }

    //your code goes here

    public void getWinner() {

        String winner = "";
        String [] nameArray = new String [players.size()];

        nameArray = players.keySet().toArray(nameArray);
        int max = 0;

        for(String en: nameArray) {
            if(players.get(en)>max){
                winner=en;
                max=players.get(en);
            }
        }

        System.out.println(winner);


    }


}
