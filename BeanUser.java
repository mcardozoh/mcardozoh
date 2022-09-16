public class BeanUser {
    private int id;
    private String name;

public BeanUser(){

}

public BeanUser(int id, String name){
    this.id = id;
    this.name = name;
}

public int getId(){
    return id;
}

public void setId (int id) {
    this.id = id;
}

public String name(){
    return name;
}

public void setname(String name){
    this.name = name;
}
}


