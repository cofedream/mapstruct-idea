/*
 *  Copyright 2017 the MapStruct authors (http://www.mapstruct.org/)
 *  and/or other contributors as indicated by the @authors tag. See the
 *  copyright.txt file in the distribution for a full listing of all
 *  contributors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.example.dto;

import java.util.List;

import org.example.dto.PersonDto;

public class CarDto {

    private String make;
    private int seatCount;
    private String manufacturingYear;
    private PersonDto myDriver;
    private List<PersonDto> passengers;
    private Long price;
    private String category;
    private boolean available;

    public CarDto() {
    }

    public CarDto(String make, int seatCount, String manufacturingYear, PersonDto myDriver, List<PersonDto> passengers) {
        this.make = make;
        this.seatCount = seatCount;
        this.manufacturingYear = manufacturingYear;
        this.myDriver = myDriver;
        this.passengers = passengers;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public String getManufacturingYear() {
        return manufacturingYear;
    }

    public void setManufacturingYear(String manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }

    public PersonDto getMyDriver() {
        return myDriver;
    }

    public void setMyDriver(PersonDto myDriver) {
        this.myDriver = myDriver;
    }

    public List<PersonDto> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<PersonDto> passengers) {
        this.passengers = passengers;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    protected void setPrivateField(String privateField) {
        // nothing to di
    }

    protected String getPrivateField() {
        return null;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
