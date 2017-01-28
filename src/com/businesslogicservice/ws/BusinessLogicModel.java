
package com.businesslogicservice.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import com.storageservice.bmi.ws.Bmi;
import com.storageservice.fitbit.ws.Goal;
import com.storageservice.person.ws.Person;
import com.storageservice.sport.ws.Activity;
import com.storageservice.sport.ws.Sport;
import com.storageservice.weather.ws.Weather;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BusinessLogicModel", targetNamespace = "http://ws.businesslogicservice.com/")
@XmlSeeAlso({
    com.businesslogicservice.ws.ObjectFactory.class,
    com.storageservice.bmi.ws.ObjectFactory.class,
    com.storageservice.fitbit.ws.ObjectFactory.class,
    com.storageservice.person.ws.ObjectFactory.class,
    com.storageservice.sport.ws.ObjectFactory.class,
    com.storageservice.weather.ws.ObjectFactory.class
})
public interface BusinessLogicModel {


    /**
     * 
     * @param startDate
     * @param person
     * @param accessToken
     * @param bmi
     * @param userId
     * @param refreshToken
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "sentence", targetNamespace = "")
    @RequestWrapper(localName = "motivationBasedOnBmiValueDifference", targetNamespace = "http://ws.businesslogicservice.com/", className = "com.businesslogicservice.ws.MotivationBasedOnBmiValueDifference")
    @ResponseWrapper(localName = "motivationBasedOnBmiValueDifferenceResponse", targetNamespace = "http://ws.businesslogicservice.com/", className = "com.businesslogicservice.ws.MotivationBasedOnBmiValueDifferenceResponse")
    @Action(input = "http://ws.businesslogicservice.com/BusinessLogicModel/motivationBasedOnBmiValueDifferenceRequest", output = "http://ws.businesslogicservice.com/BusinessLogicModel/motivationBasedOnBmiValueDifferenceResponse")
    public String motivationBasedOnBmiValueDifference(
        @WebParam(name = "person", targetNamespace = "")
        Person person,
        @WebParam(name = "startDate", targetNamespace = "")
        String startDate,
        @WebParam(name = "bmi", targetNamespace = "")
        Bmi bmi,
        @WebParam(name = "access_token", targetNamespace = "")
        String accessToken,
        @WebParam(name = "user_id", targetNamespace = "")
        String userId,
        @WebParam(name = "refresh_token", targetNamespace = "")
        String refreshToken);

    /**
     * 
     * @param person
     * @param accessToken
     * @param userId
     * @param sports
     * @param refreshToken
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "sentence", targetNamespace = "")
    @RequestWrapper(localName = "dailymotivationalCalories", targetNamespace = "http://ws.businesslogicservice.com/", className = "com.businesslogicservice.ws.DailymotivationalCalories")
    @ResponseWrapper(localName = "dailymotivationalCaloriesResponse", targetNamespace = "http://ws.businesslogicservice.com/", className = "com.businesslogicservice.ws.DailymotivationalCaloriesResponse")
    @Action(input = "http://ws.businesslogicservice.com/BusinessLogicModel/dailymotivationalCaloriesRequest", output = "http://ws.businesslogicservice.com/BusinessLogicModel/dailymotivationalCaloriesResponse")
    public String dailymotivationalCalories(
        @WebParam(name = "sports", targetNamespace = "")
        List<Sport> sports,
        @WebParam(name = "person", targetNamespace = "")
        Person person,
        @WebParam(name = "access_token", targetNamespace = "")
        String accessToken,
        @WebParam(name = "user_id", targetNamespace = "")
        String userId,
        @WebParam(name = "refresh_token", targetNamespace = "")
        String refreshToken);

    /**
     * 
     * @param startDate
     * @param person
     * @param accessToken
     * @param bmi
     * @param userId
     * @param refreshToken
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "sentence", targetNamespace = "")
    @RequestWrapper(localName = "motivationBaseOnBmiStatus", targetNamespace = "http://ws.businesslogicservice.com/", className = "com.businesslogicservice.ws.MotivationBaseOnBmiStatus")
    @ResponseWrapper(localName = "motivationBaseOnBmiStatusResponse", targetNamespace = "http://ws.businesslogicservice.com/", className = "com.businesslogicservice.ws.MotivationBaseOnBmiStatusResponse")
    @Action(input = "http://ws.businesslogicservice.com/BusinessLogicModel/motivationBaseOnBmiStatusRequest", output = "http://ws.businesslogicservice.com/BusinessLogicModel/motivationBaseOnBmiStatusResponse")
    public String motivationBaseOnBmiStatus(
        @WebParam(name = "bmi", targetNamespace = "")
        Bmi bmi,
        @WebParam(name = "startDate", targetNamespace = "")
        String startDate,
        @WebParam(name = "person", targetNamespace = "")
        Person person,
        @WebParam(name = "access_token", targetNamespace = "")
        String accessToken,
        @WebParam(name = "user_id", targetNamespace = "")
        String userId,
        @WebParam(name = "refresh_token", targetNamespace = "")
        String refreshToken);

    /**
     * 
     * @param sports
     * @param weather
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "sentence", targetNamespace = "")
    @RequestWrapper(localName = "dailymotivationalWeather", targetNamespace = "http://ws.businesslogicservice.com/", className = "com.businesslogicservice.ws.DailymotivationalWeather")
    @ResponseWrapper(localName = "dailymotivationalWeatherResponse", targetNamespace = "http://ws.businesslogicservice.com/", className = "com.businesslogicservice.ws.DailymotivationalWeatherResponse")
    @Action(input = "http://ws.businesslogicservice.com/BusinessLogicModel/dailymotivationalWeatherRequest", output = "http://ws.businesslogicservice.com/BusinessLogicModel/dailymotivationalWeatherResponse")
    public String dailymotivationalWeather(
        @WebParam(name = "sports", targetNamespace = "")
        List<Sport> sports,
        @WebParam(name = "weather", targetNamespace = "")
        Weather weather);

    /**
     * 
     * @param startDate
     * @param goalWeight
     * @param startWeight
     * @param endDate
     * @param weightDifference
     * @param idPerson
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "sentence", targetNamespace = "")
    @RequestWrapper(localName = "motivationBasedOnWeightDifference", targetNamespace = "http://ws.businesslogicservice.com/", className = "com.businesslogicservice.ws.MotivationBasedOnWeightDifference")
    @ResponseWrapper(localName = "motivationBasedOnWeightDifferenceResponse", targetNamespace = "http://ws.businesslogicservice.com/", className = "com.businesslogicservice.ws.MotivationBasedOnWeightDifferenceResponse")
    @Action(input = "http://ws.businesslogicservice.com/BusinessLogicModel/motivationBasedOnWeightDifferenceRequest", output = "http://ws.businesslogicservice.com/BusinessLogicModel/motivationBasedOnWeightDifferenceResponse")
    public String motivationBasedOnWeightDifference(
        @WebParam(name = "idPerson", targetNamespace = "")
        int idPerson,
        @WebParam(name = "startDate", targetNamespace = "")
        String startDate,
        @WebParam(name = "endDate", targetNamespace = "")
        String endDate,
        @WebParam(name = "startWeight", targetNamespace = "")
        double startWeight,
        @WebParam(name = "goalWeight", targetNamespace = "")
        double goalWeight,
        @WebParam(name = "weightDifference", targetNamespace = "")
        double weightDifference);

    /**
     * 
     * @param goal
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "sentence", targetNamespace = "")
    @RequestWrapper(localName = "motivationBasedOnGoalSteps", targetNamespace = "http://ws.businesslogicservice.com/", className = "com.businesslogicservice.ws.MotivationBasedOnGoalSteps")
    @ResponseWrapper(localName = "motivationBasedOnGoalStepsResponse", targetNamespace = "http://ws.businesslogicservice.com/", className = "com.businesslogicservice.ws.MotivationBasedOnGoalStepsResponse")
    @Action(input = "http://ws.businesslogicservice.com/BusinessLogicModel/motivationBasedOnGoalStepsRequest", output = "http://ws.businesslogicservice.com/BusinessLogicModel/motivationBasedOnGoalStepsResponse")
    public String motivationBasedOnGoalSteps(
        @WebParam(name = "goal", targetNamespace = "")
        Goal goal);

    /**
     * 
     * @param favouriteActivities
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "sentence", targetNamespace = "")
    @RequestWrapper(localName = "motivationBasedOnFavouriteActivities", targetNamespace = "http://ws.businesslogicservice.com/", className = "com.businesslogicservice.ws.MotivationBasedOnFavouriteActivities")
    @ResponseWrapper(localName = "motivationBasedOnFavouriteActivitiesResponse", targetNamespace = "http://ws.businesslogicservice.com/", className = "com.businesslogicservice.ws.MotivationBasedOnFavouriteActivitiesResponse")
    @Action(input = "http://ws.businesslogicservice.com/BusinessLogicModel/motivationBasedOnFavouriteActivitiesRequest", output = "http://ws.businesslogicservice.com/BusinessLogicModel/motivationBasedOnFavouriteActivitiesResponse")
    public String motivationBasedOnFavouriteActivities(
        @WebParam(name = "favouriteActivities", targetNamespace = "")
        List<Activity> favouriteActivities);

    /**
     * 
     * @param forecast
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "sentence", targetNamespace = "")
    @RequestWrapper(localName = "motivationBasedonForecast", targetNamespace = "http://ws.businesslogicservice.com/", className = "com.businesslogicservice.ws.MotivationBasedonForecast")
    @ResponseWrapper(localName = "motivationBasedonForecastResponse", targetNamespace = "http://ws.businesslogicservice.com/", className = "com.businesslogicservice.ws.MotivationBasedonForecastResponse")
    @Action(input = "http://ws.businesslogicservice.com/BusinessLogicModel/motivationBasedonForecastRequest", output = "http://ws.businesslogicservice.com/BusinessLogicModel/motivationBasedonForecastResponse")
    public String motivationBasedonForecast(
        @WebParam(name = "forecast", targetNamespace = "")
        List<Weather> forecast);

    /**
     * 
     * @param person
     * @param goal
     * @return
     *     returns com.storageservice.person.ws.Person
     */
    @WebMethod
    @WebResult(name = "sentence", targetNamespace = "")
    @RequestWrapper(localName = "verifyAndIncrementDailyGoalAchieved", targetNamespace = "http://ws.businesslogicservice.com/", className = "com.businesslogicservice.ws.VerifyAndIncrementDailyGoalAchieved")
    @ResponseWrapper(localName = "verifyAndIncrementDailyGoalAchievedResponse", targetNamespace = "http://ws.businesslogicservice.com/", className = "com.businesslogicservice.ws.VerifyAndIncrementDailyGoalAchievedResponse")
    @Action(input = "http://ws.businesslogicservice.com/BusinessLogicModel/verifyAndIncrementDailyGoalAchievedRequest", output = "http://ws.businesslogicservice.com/BusinessLogicModel/verifyAndIncrementDailyGoalAchievedResponse")
    public Person verifyAndIncrementDailyGoalAchieved(
        @WebParam(name = "goal", targetNamespace = "")
        Goal goal,
        @WebParam(name = "person", targetNamespace = "")
        Person person);

}