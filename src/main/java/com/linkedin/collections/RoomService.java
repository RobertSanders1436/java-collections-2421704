package com.linkedin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class RoomService {

	Collection<Room> inventory;

	public RoomService() {
		this.inventory = new ArrayList<>();


	}

	public Collection<Room> getInventory(){
		
	// 3. Return the Room Inventory
		
		return new ArrayList<>(this.inventory);
	}
	
	public void createRoom(String name, String type, int capacity, double rate) {
	
	// 4. Add a new Room to the Room Inventory using the provided parameters
		this.inventory.add(new Room(name, type, capacity, rate));

	}

	public void createRooms(Room[] rooms) {
	
	// 5. Add the Rooms provided in the Array to the Room Inventory
		this.inventory.addAll(Arrays.asList(rooms));


	}
	
	public void removeRoom(Room room) {
		
	// 6. Remove the provided Room from the Room Inventory
		this.inventory.remove(room);


	}

}
