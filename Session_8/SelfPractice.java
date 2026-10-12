class Room {
     void showRoom(){
        System.out.println("This is a room");
     }
}

class House{
    private Room room;

    House(Room room){
        this.room = room;
    }

    void showHouse() {
    room.showRoom();
    System.out.println("This is a house");
}
}

class SelfPractice{
    public static void main(String[] args) {
        Room r1 = new Room();
        House h1 = new House(r1);
        r1.showRoom();
        h1.showHouse();
    }
}
