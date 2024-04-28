package com.DIAndIoC.Depndency;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;


@Component
@Scope(scopeName = "prototype") /*prototype give new object every type*/
public class Doctor implements staff, BeanNameAware { /*used for bean life cycle*/

    /*
    * Spring bean scope
    * 1. Singleton example */
    private String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "qualification='" + qualification + '\'' +
                '}';
    }

    public void assist(){
        System.out.println("Doctor is assisting");
    }


    /*Bean life cycle, setting bean, method*/
    @Override
    public void setBeanName(String name) {
        System.out.println("set Bean name method is called");
    }

    /*Annotation based custom method*/
    @PostConstruct
    public void postConstructor(){
        System.out.println("Post_Constructor Method is called");
    }

    @PreDestroy
    public void pre_Destroy(){
        System.out.println("Pre Destroy Method is called");
    }






    /*  private String qualification;

    *//*Constructor for injection*//*
    public Doctor(String qualification) {
        this.qualification = qualification;
    }
*/

    /*to access of object of nurse
    * use ref instead of value inside property tag in XML file
    * create setter and getter method*/
//    private Nurse nurse;



    /*Getter and setter method*/
 /*   public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }*/

    /*this abstracted for staff abstract method*/


}
