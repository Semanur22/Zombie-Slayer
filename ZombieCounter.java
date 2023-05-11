public class ZombieCounter {
    private int count = 0;
    private int killed = 0;

    synchronized void zombieEntered() {
        count++;
    }
    // Keeps track of number of zombies entered.

    synchronized void zombieKilled() {
        killed++;
        count--;
    }
    // Keeps track of number of zombies killed.

    synchronized boolean tooManyZombiesInTheRoom() {
        return count > 100;
    }
    // Returns true if the number of zombies in the room are greater than or equal
    // 100.

    synchronized boolean killed100Zombies() {
        return killed > 100;
    }
    // Returns true if more than 100 zombies have been killed.

    synchronized boolean zombiesExist() {
        return count > 0;
    }
    // Returns true if there is at least one zombie in the room.

    synchronized int getKilledCount() {
        return killed;
    }
    // Returns the count of the number of zombies killed.

    synchronized int getInTheRoomCount() {
        return count;
    }
    // Returns the count of the number of zombies in the room.

}