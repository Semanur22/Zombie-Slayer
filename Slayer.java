public class Slayer extends Thread {
    ZombieCounter zc;

    public Slayer(ZombieCounter zc) {
        this.zc = zc;
    }

    @Override
    public void run() {
        while (!zc.tooManyZombiesInTheRoom() && !zc.killed100Zombies()) {

            if (zc.getInTheRoomCount() != 0) {
                zc.zombieKilled();
            }

            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
