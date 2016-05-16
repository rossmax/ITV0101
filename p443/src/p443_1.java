import java.util.Scanner;

public class p443_1 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int k = 0;
		long[] numbers = new long[num];
		numbers[0] = 1;	
		for(int i = 1; i < num; i++, k++){
			for(long n = 2 + k; n <= 2000000000 ; n++){
				if(CheckTo2357(n) == true){
					if(n % 2 == 0){
						if(DissolutionTo2(n) == true){
							numbers[i] = n;
							break;
						}	
					}
					if(n % 3 == 0){
						if(DissolutionTo3(n) == true){
							numbers[i] = n;
							break;
						}	
					}
					if(n % 5 == 0){
						if(DissolutionTo5(n) == true){
							numbers[i] = n;
							break;
						}	
					}
					if(n % 7 == 0){
						if(DissolutionTo7(n) == true){
							numbers[i] = n;
							break;
						}
					}
					
				}
				i = i - 1;
				break;
				
			}		
		}

		if (num % 100 >= 10 && num % 100 <= 19)
		  System.out.print("The " + num + "th humble number is " + numbers[numbers.length - 1]
		  + ".\n");
		  else if (num % 10 == 1)
		    System.out.print("The " + num + "st humble number is " + numbers[numbers.length - 1]
		  + ".\n");
		  else if (num % 10 == 2)
		    System.out.print("The " + num + "nd humble number is " + numbers[numbers.length - 1]
		  + ".\n");
		  else if (num % 10 == 3)
		    System.out.print("The " + num + "rd humble number is " + numbers[numbers.length - 1]
		  + ".\n");
		  else
		    System.out.print("The " + num + "th humble number is " + numbers[numbers.length - 1]
		  + ".\n");

	}
	
	public static boolean CheckTo2357(long n){
		
		if(n % 2 == 0 || n % 3 == 0 || n % 5 == 0 || n % 7 == 0){
			return true;	
		}
		if(n == 1)return true;
		return false;		
	}
	
	public static boolean DissolutionTo2(long number){
	
		while(number != 1){
			number = number / 2 ;
			if(number % 2 != 0 && number % 3 == 0){
				if(DissolutionTo3(number) == true){
					return true;
				}
				return false;
			}
			if(number % 2 != 0 && number % 5 == 0){
				if(DissolutionTo5(number) == true){
					return true;
				}
				return false;
			}
			if(number % 2 != 0 && number % 7 == 0){
				if(DissolutionTo7(number) == true){
					return true;
				}
				return false;
			}
			if(CheckTo2357(number) == false){
				return false;
			}
			
		}
		return true;
	}
	
	public static boolean DissolutionTo3(long number){
		
		while(number != 1){
			number = number / 3 ;
			if(number % 3 != 0 && number % 2 == 0){
				if(DissolutionTo2(number) == true){
					return true;
				}
				return false;
			}
			if(number % 3 != 0 && number % 5 == 0){
				if(DissolutionTo5(number) == true){
					return true;
				}
				return false;
			}
			if(number % 3 != 0 && number % 7 == 0){
				if(DissolutionTo7(number) == true){
					return true;
				}
				return false;
			}
			if(CheckTo2357(number) == false){
				return false;
			}
			
		}
		return true;	
	}
	public static boolean DissolutionTo5(long number){
		
		while(number != 1){
			number = number / 5 ;
			if(number % 5 != 0 && number % 2 == 0){
				if(DissolutionTo2(number) == true){
					return true;
				}
				return false;
			}
			if(number % 5 != 0 && number % 3 == 0){
				if(DissolutionTo3(number) == true){
					return true;
				}	
				return false;
			}
			if(number % 5 != 0 && number % 7 == 0){
				if(DissolutionTo7(number) == true){
					return true;
				}	
				return false;
			}
			if(CheckTo2357(number) == false){
				return false;
			}
			
		}
		return true;	
	}
	public static boolean DissolutionTo7(long number){
		
		while(number != 1){
			number = number / 7 ;
			if(number % 7 != 0 && number % 2 == 0){
			  if(DissolutionTo2(number) == true){
          return true;
        } 
        return false;
			}
			if(number % 7 != 0 && number % 3 == 0){
			  if(DissolutionTo3(number) == true){
          return true;
        } 
        return false;	
			}
			if(number % 7 != 0 && number % 5 == 0){
			  if(DissolutionTo5(number) == true){
          return true;
        } 
        return false;
			}
			if(CheckTo2357(number) == false){
				return false;
			}
			
		}
		return true;	
	}
		
	}
