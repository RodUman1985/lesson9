package com.company;

  public class Cat extends Animal{

    public Cat() {
        super ("rad");
    }


    public Cat(String color) {
        super (color);
    }

      @Override
      public String toString() {
          return "Cat:"+ this.color;
      }

      @Override
      public int hashCode() {
          return super.hashCode();
      }

      @Override
      public boolean equals(Object obj) {
       // проверка совпадения ссылок
        if (this==obj) {
            return true;
        }
       // проверка совпадения hash- кодов
       if (this.hashCode()==obj.hashCode()) {
           return true;
       }
       // преобразуем объект типа Object к объекту типа Cat

       // insatanceof проверка возможности приведения классов
          if ((obj instanceof Cat)){
              Cat compCat= (Cat)obj;
              return compCat.color.equals(this.color);
          }
       return false;
      }
  }
