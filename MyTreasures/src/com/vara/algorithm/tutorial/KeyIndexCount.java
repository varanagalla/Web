/**
 * 
 */
package com.vara.algorithm.tutorial;

/**
 * @author vpsrini
 *
 */
public class KeyIndexCount {
	
	
	
	public void sortBySection(Student[] a, int radix){
		
		//Compute the frequency by key.
		int count[] = new int[radix + 1];
		int studNo = a.length;
		for(int index=0; index < studNo; index++){
			count[a[index].key() + 1] ++;
		}
		//Transform count to start index
		for(int r=0; r < radix; r++){
			count[r+1] += count[r];
		}
		//Distribute records
		Student[] aux = new Student[studNo];
		for(int j=0; j < studNo; j++){
			aux[count[a[j].key()]++] = a[j];
		}
		//Copy back
		for(int k=0; k<studNo; k++){
			a[k] = aux[k];
		}
		
		for(int l=0; l<studNo; l++){
			System.out.println(a[l].getName() + "\t" + a[l].key());
		}
	}

}
