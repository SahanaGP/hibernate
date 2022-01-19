package com.xworkz.tour.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data //@getter@setter@ToString@EqualsAndHashCode
@AllArgsConstructor

public class VehicleEntity implements Serializable{

	private int vehicleId;
	private String vehicleName;
	private String vehicleModel;
	private float price;
	private String vehicleColour;
}
