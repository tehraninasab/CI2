package game;

import java.util.ArrayList;
import java.util.Iterator;

import game.asset.Asset;
import game.asset.Bomb;

public class Game {
	ArrayList<Gamer> gamers = new ArrayList<Gamer>();
	ArrayList<Rocket> rockets = new ArrayList<Rocket>();
	ArrayList<Asset> assets = new ArrayList<Asset>();
	boolean running = false;
	
	public void throwBomb(int gamerID, Location firstPlace) {
		synchronized(assets) {
	     	assets.add(new Bomb(assets.size(), gamerID, firstPlace));
		}
	}
	
	public void move() {
		synchronized(assets) {
			for(Asset asset: assets) {
				asset.move();
			}
		}
	}
	
	public void remove() {
		synchronized(assets) {
			Iterator<Asset> itr = assets.iterator();
			
			while(itr.hasNext()) {
				Asset asset = itr.next();
				if(asset.remove()) {
					itr.remove();
				}
			}
		}
	}
	
	public void start() {
		running = true;
	}
	
	public void pause() {
		running = false;
	}
	
	public boolean running() {
		return running;
	}
	
	public void setMousePressed(int gamerID, boolean mousePressed) {
		getRocket(gamerID).setMousePressed(mousePressed);
	}
	
	public void setLocation(int gamerID, Location location) {
		getRocket(gamerID).setLocation(location);
	}
	
	public Gamer getGamer(int gamerID) {
		synchronized(gamers) {
			for(Gamer gamer: gamers) {
				if(gamer.getID() == gamerID) {
					return gamer;
				}
			}
		}
		return null;
	}
	
	public Rocket getRocket(int gamerID) {   //return rocket using gamerID;
		synchronized(rockets) {
			for(Rocket rocket : rockets) {
				if(rocket.getGamerID() == gamerID) {
					return rocket;
				}
			}
		}
		return null;
	}
	
	public int getRocketsSize() {
		return rockets.size();
	}
	
	public void addGamer(Gamer gamer) {
		synchronized(gamers) {
			gamers.add(gamer);
		}
	}
	
	public void addRocket(Rocket rocket) {
		rockets.add(rocket);
	}
	
	public ArrayList<Rocket> getRockets(){
		return rockets;
	}

	public ArrayList<Asset> getAssets(){
		return assets;
	}
	
	
	
	

	

}
