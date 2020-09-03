package br.com.pdp.aula;

public aspect World { 

     // pointcut greeting() : execution(* Hello.sayHello(..)); 
     // pointcut greeting() : execution(* *.sayHello(..));
     // pointcut greeting() : execution(* Hello.*(..));
      pointcut greeting() : execution(* Hello.*Hello(..));
      
  /*  after() returning() : greeting() { 
          System.out.println("Hello World!"); 
      }
   */  
      
  /*   before() : greeting() { 
          System.out.println("Hello World!"); 
      }*/ 
     
   void around() : greeting() { 
         System.out.println(" World!"); 
     } 


 }