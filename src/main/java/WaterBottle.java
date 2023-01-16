public class WaterBottle {
    private int volume;
  public WaterBottle(){
      volume = 100;
  }

  public int getVolume(){
      return this.volume;
  }

  public int drink(){
      return this.volume -= 10;
  }

  public void emptyWaterBottle() {
      this.volume = 0;
  }

  public void refillWaterBottle() {
      this.volume = 100;
  }
}
