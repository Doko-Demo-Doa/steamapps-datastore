package com.clipsub.steamapps.annotation;

import org.springframework.http.HttpMethod;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface DisableCRUDAction {
    /**
     * HttpMethod.GET => Disable get list, get by id via CRUDRestResource
     * HttpMethod.DELETE => Disable delete record via CRUDRestResource
     * HttpMethod.POST => Disable create record via CRUDRestResource
     * HttpMethod.PUT => Disable edit record via CRUDRestResource
     * HttpMethod.PATCH => Disable edit field of record via CRUDRestResource
     *
     * @return void
     */
    HttpMethod[] value() default {};
}
