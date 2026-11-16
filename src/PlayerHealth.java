class Player{
    String name;
    int health;

    Player(String name, int health){
        this.name = name;
        this.health = health;
    }

    int getHealth(){
        return health;
    }

    String getName(){
        return name;
    }

    void setHealth(int newHealth){
        if(newHealth<0 || newHealth>1000){
            System.out.println("Invalid health " + newHealth);
            return;
        }

        this.health = newHealth;
    }

}

public class PlayerHealth {
    static void main() {
        Player player1 = new Player("CR7", 999);
        player1.setHealth(997);
        player1.setHealth(100000);
        System.out.println("name: "+ player1.name);
        System.out.println("health: "+ player1.health);

    }

}
