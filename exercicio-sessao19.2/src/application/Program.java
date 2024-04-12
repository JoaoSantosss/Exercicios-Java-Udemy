package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import entities.Vote;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Map<String, Vote> candidatesVotes = new HashMap<>();
		
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				if (candidatesVotes.containsKey(fields[0])) {
					
					candidatesVotes.get(fields[0]).setVotes(
							candidatesVotes.get(fields[0]).getVotes() + Integer.parseInt(fields[1]));
					
				}
				else {
					Vote vote = new Vote(fields[0], Integer.parseInt(fields[1]));
					candidatesVotes.put(vote.getCandidateName(), vote);
				}
				
				line = br.readLine();
				
			}
			
			for (String v : candidatesVotes.keySet()) {
				System.out.println(
						candidatesVotes.get(v).getCandidateName() 
						+ " = "
						+ candidatesVotes.get(v).getVotes());
			}
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
			
		}
		
		

}
