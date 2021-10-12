package com.example.laba1.Laba2;

import com.example.laba1.Laba2.Interfaces.Gender;
import com.example.laba1.Laba2.Interfaces.PlaceOfResidence;
import com.example.laba1.Laba2.Interfaces.Work;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


//@Component("getHuman")
public class Human {
    @Autowired
    private PlaceOfResidence _residence;

    @Autowired
    private @Qualifier("getFirstWork") Work _firstWork;

    @Autowired
    private @Qualifier("getSecondWork") Work _secondWork;

    @Autowired
    private Gender _gender;

    @Value("25")
    private int _age;


    public Human(PlaceOfResidence residence,
                 @Qualifier("getFirstWork") Work work1,
                 @Qualifier("getSecondWork") Work work2,
                 Gender gender) {
        _residence = residence;
        _firstWork = work1;
        _secondWork = work2;
        _gender = gender;
    }

    @Autowired
    public void setResidence(PlaceOfResidence residence){ _residence = residence; }

    @Autowired
    public void setFirstWork(@Qualifier("getFirstWork") Work work) { _firstWork = work; }

    @Autowired
    public void setSecondWork(@Qualifier("getSecondWork") Work work) { _secondWork = work; }

    public void setAge(int age) { _age = age; }

    @Autowired
    public void setGender(Gender gender) { _gender = gender; }

    public int getAge() { return _age; }

    public void ResidenceType() { _residence.kindOfResidence(); }
    public void FirstWorkSlogan() { _firstWork.slogan(); }
    public void SecondWorkSlogan() { _secondWork.slogan(); }
    public void GenderType() { _gender.SayGender(); }

}



