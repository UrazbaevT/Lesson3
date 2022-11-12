
public class User {

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalNameException {
        if (name.length() > 20){
            throw new IllegalNameException("Ошибка. Длина имени не может быть больше 20 симовлов. " +
                    "Вы задали " + name);
        }
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age <= 0 || age > 100){
            throw new IllegalAgeException("Ошибка. Возраст пользователя " +
                    "не должно быть больше 100 или меньше 0. Вы задали " + age);
        }
        this.age = age;
    }
}
