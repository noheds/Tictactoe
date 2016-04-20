import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		
		
		Scanner sc1 = new Scanner(System.in);
		
		 
			
			 Play();
		 }
		 
	
			public static void Play(){
			
			       
				Scanner sc1 = new Scanner(System.in);
				String p1="";
				String p2="";
				imprimir("Welcome,let's play Tic-tac-Force" );
				imprimir("ingrese el nombre del jugador Sith");
				 p1=sc1.next();
				 imprimir("ingrese el nombre del Jedi");
				 p2=sc1.next();
				 int n=3;
			       String [] arreglo1=new String [n];
			       arreglo1[0] =(" ");
			       arreglo1[1] =(" ");
			       arreglo1[2] =(" ");
			       String [] arreglo2=new String [n];
			       arreglo2[0] =(" ");
			       arreglo2[1] =(" ");
			       arreglo2[2] =(" ");
			       String [] arreglo3=new String [n];
			       arreglo3[0] =(" ");
			       arreglo3[1] =(" ");
			       arreglo3[2] =(" ");
			        System.out.println("  "+arreglo1[0]+" |"+arreglo1[1]+" |"+arreglo1[2]);
			        System.out.println("----------");
			        System.out.println("  "+ arreglo2[0]+" |"+arreglo2[1]+" |"+arreglo2[2]);  
			        System.out.println("----------");
			        System.out.println("  "+arreglo3[0]+" |"+arreglo3[1]+" |"+arreglo3[2]); 
			        
			        
			        
				for(int i=0;i<=9;i++){
				 if(i%2==0){
					 imprimir("el turno es de "+ p1);
				 }
				 else{
					 imprimir("El turno es de "+ p2);
				 }
				
				        
			imprimir("Ingrese las coordenadas de su jugada");
			imprimir(" Donde: El primer numero corresponde a las coordenadas de X");
			imprimir("        El segundo numero corresponde a las coordenadas de Y");
			if(i%2==0){ 
			int col=sc1.nextInt();
			int fil=sc1.nextInt();
			
			if(col==1){
				if(fil==1){
					arreglo1[0] =("X");
				    }
					    else{
							if(fil==2){
								arreglo2[0] =("X");
									}	
									else{
										if(fil==3){
											arreglo3[0]=("X");
												}
										
													}
														}	
				
															}
				if(col==2){
					if(fil==1){
						arreglo1[1] =("X");
					    }
						   else{
								if(fil==2){
									arreglo2[1] =("X");
										}	
										else{
											if(fil==3){
										}
											arreglo3[1] =("X");
													}
														}	
					
															}
				if(col==3){
					if(fil==1){
						arreglo1[2] =("X");
					    }
						   else{
								if(fil==2){
									arreglo2[2] =("X");
										}	
										else{
											if(fil==3){
										}
											arreglo3[2] =("X");
													}
														}	
					
															}
				 System.out.println("  "+arreglo1[0]+" |"+arreglo1[1]+" |"+arreglo1[2]);
			        System.out.println("----------");
			        System.out.println("  "+ arreglo2[0]+" |"+arreglo2[1]+" |"+arreglo2[2]);  
			        System.out.println("----------");
			        System.out.println("  "+arreglo3[0]+" |"+arreglo3[1]+" |"+arreglo3[2]); 	
			        
			        if (arreglo1[0]==("X") && arreglo2[1]==("X") && arreglo3[2]==("X") || arreglo1[0]==("X") 
							   && arreglo2[0]==("X") &&  arreglo3[0]==("X") || arreglo1[1]==("X") 
							   && arreglo2[1]==("X") && arreglo3[1]==("X") || arreglo1[2]==("X") 
									   && arreglo2[2]==("X") && arreglo3[2]==("X")|| arreglo1[0]==("X") 
									   && arreglo1[1]==("X") && arreglo1[2]==("X") || arreglo2[0]==("X") 
									   && arreglo2[1]==("X") && arreglo2[2]==("X") ||arreglo3[0]==("X") 
											   && arreglo3[1]==("X") && arreglo3[2]==("X")) {
			        	
						   if(i%2==0){
						   imprimir( p2+" La fuerza es fuerte en ti, Has ganado!");
						   i=9;}
						   else{
						   imprimir( p2+" La fuerza es fuerte en ti, Has ganado!");
						   i=9;
						   }}
			        
			        
			        
						   
					
			        
			     
			}
				else{
					
					int col2=sc1.nextInt();
					int fil2=sc1.nextInt();
					
					if(col2==1){
						if(fil2==1){
							arreglo1[0] =("O");
						    }
							    else{
									if(fil2==2){
										arreglo2[0] =("O");
											}	
											else{
												if(fil2==3){
													arreglo3[0]=("O");
														}
												
															}
																}	
						
																	}
						if(col2==2){
							if(fil2==1){
								arreglo1[1] =("O");
							    }
								   else{
										if(fil2==2){
											arreglo2[1] =("O");
												}	
												else{
													if(fil2==3){
												}
													arreglo3[1] =("O");
															}
																}	
							
																	}
						if(col2==3){
							if(fil2==1){
								arreglo1[2] =("O");
							    }
								   else{
										if(fil2==2){
											arreglo2[2] =("O");
												}	
												else{
													if(fil2==3){
												}
													arreglo3[2] =("O");
															}
																}	
							
																	}
						    System.out.println("  "+arreglo1[0]+" |"+arreglo1[1]+" |"+arreglo1[2]);
					        System.out.println("----------");
					        System.out.println("  "+ arreglo2[0]+" |"+arreglo2[1]+" |"+arreglo2[2]);  
					        System.out.println("----------");
					        System.out.println("  "+arreglo3[0]+" |"+arreglo3[1]+" |"+arreglo3[2]);
					        
					
					        if (arreglo1[0]==("O") && arreglo2[1]==("O") && arreglo3[2]==("O") || arreglo1[0]==("O") 
									   && arreglo2[0]==("O") &&  arreglo3[0]==("O") || arreglo1[1]==("O") 
									   && arreglo2[1]==("O") && arreglo3[1]==("O") || arreglo1[2]==("O") 
											   && arreglo2[2]==("O") && arreglo3[2]==("O")|| arreglo1[0]==("O") 
											   && arreglo1[1]==("O") && arreglo1[2]==("O") || arreglo2[0]==("O") 
											   && arreglo2[1]==("O") && arreglo2[2]==("O") ||arreglo3[0]==("O") 
													   && arreglo3[1]==("O") && arreglo3[2]==("O")){
					        		
								   if(i%2==0){
								   imprimir( p2+" La fuerza es fuerte en ti, Has ganado!");
								   i=9;}
								   else{
								   imprimir( p2+" La fuerza es fuerte en ti, Has ganado!");
								   i=9;
								   }}
						   
					   }   
					}}
			
			
			
			
				
			
	
	
		public static void imprimir(String mensaje){
		System.out.println(mensaje);
			}

		 		
			
					
					
			}
		

