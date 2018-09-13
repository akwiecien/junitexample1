class gosuClass {

  var id : String ;

  public construct(){
    this.id = UUID.randomUUID().toString();
  }

  public property get GetId():String{
    return this.id;
  }

}