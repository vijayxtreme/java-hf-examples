class Player {
    static int playerCount = 0; //available to all instances
    private String name;

    //Constructor
    public Player(String n){
        name = n;
        playerCount++;
    }

}
