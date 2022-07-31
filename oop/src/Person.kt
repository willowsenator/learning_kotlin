class Person(){
    private var name:String? = null
    private var age:Int? = null
    private var genre:String? = null


    constructor(name:String?, age:Int?, genre:String?):this(){
        this.name = name;
        this.age = age;
        this.genre = genre;
    }

    fun getName(): String? {
        return name;
    }

    fun getAge():Int?{
        return age;
    }

    fun getGenre():String?{
        return genre;
    }

    override fun toString(): String {
        return "Person(name=$name, age=$age, genre=$genre)"
    }


}