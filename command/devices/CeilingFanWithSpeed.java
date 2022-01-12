package command.devices;

public class CeilingFanWithSpeed {
   public static final int OFF_SPEED = 0;
   public static final int LOW_SPEED = 1;
   public static final int MEDIUM_SPEED = 2;  
   public static final int HIGH_SPEED = 3;

   String location;
   int speed;
   boolean on = false;

   public CeilingFanWithSpeed(String location){
       this.location = location;
       this.speed = OFF_SPEED;
   }

   public void on() {
       System.out.println(String.format("[CeilingFan@%s] is on at LOW speed", location));
       on = true;
       this.speed = LOW_SPEED;
   }

   public void off() {
        System.out.println(String.format("[CeilingFan@%s] is off", location));
        this.speed = OFF_SPEED;
        on = false;
   }

   public void lowSpeed() {
       if (on){
        this.speed = LOW_SPEED;
       }
   }

   public void mediumSpeed() {
       if (on) {
        this.speed = MEDIUM_SPEED;
       }
   }

   public void highSpeed() {
       if (on) {
        this.speed = HIGH_SPEED;
       }
   }

   public int getSpeed() {
       return this.speed;
   }
}
