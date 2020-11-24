class Cookie {
  private int number;
  //how many cookies are there
  private int bakeTemp;
  //temperature in Farenheit
  private int bakeTime;
  // time in minutes
  private boolean isReady;
  //To show if the cookie is ready to be eaten

  Cookie(){
    number = 0;
    bakeTemp = 0;
    bakeTime = 0;
    isReady = false;

  }

  Cookie(int aNum, int aBakeTemp){
    number = aNum;
    bakeTemp = aBakeTemp;
    bakeTime = aBakeTemp;
    isReady = false;
  }

  boolean getIsReady(){
    return isReady;
  }

  void setNumber(int aCookieNumber){
    number = aCookieNumber;
  }
  
  void bake(int aBakeTemp, int aBakeTime){
    System.out.println(number + " cookies were baked at " + aBakeTemp + " degrees F for " + aBakeTime + " minutes.");
  }

}