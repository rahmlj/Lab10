class Sugar extends Cookie {
  private String cShape;
  private boolean isDecorated;

  Sugar() {
    cShape = "";
    isDecorated = false;
  }

  Sugar(String aShape) {
    cShape = aShape;
    isDecorated = false;
  }
  String getShape(){
    return cShape;
  }
  void setShape(String aShape){
    cShape = aShape;

  }
  void shapeCutOut(String aShape, int number){
    System.out.println(number + " cookies were cut into " + aShape);
    super.setNumber(number);

  }

  void decorate() {
    if(super.getIsReady()){
      isDecorated = true;
      System.out.println("The cookies were decorated");
    }
    else {
      System.out.println("Make sure to bake the cookies first");
    }
  }

}