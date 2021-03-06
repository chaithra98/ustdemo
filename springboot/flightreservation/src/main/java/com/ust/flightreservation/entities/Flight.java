����   8 V  )com/ust/flightreservation/entities/Flight  1com/ust/flightreservation/entities/AbstractEntity flightNumber Ljava/lang/String; operatingAirlines departureCity arrivalCity dateOfDeparture Ljava/util/Date; estimatedDepartureTime Ljava/sql/Timestamp; <init> ()V Code
     LineNumberTable LocalVariableTable this +Lcom/ust/flightreservation/entities/Flight; getFlightNumber ()Ljava/lang/String;	     setFlightNumber (Ljava/lang/String;)V MethodParameters getOperatingAirlines	      setOperatingAirlines getDepartureCity	  $   setDepartureCity getArrivalCity	  ( 	  setArrivalCity getDateOfDeparture ()Ljava/util/Date;	  - 
  setDateOfDeparture (Ljava/util/Date;)V getEstimatedDepartureTime ()Ljava/sql/Timestamp;	  3   setEstimatedDepartureTime (Ljava/sql/Timestamp;)V toString 8 java/lang/StringBuilder : Flight [flightNumber=
 7 <  
 7 > ? @ append -(Ljava/lang/String;)Ljava/lang/StringBuilder; B , operatingAirlines= D , departureCity= F , arrivalCity= H , dateOfDeparture=
 7 J ? K -(Ljava/lang/Object;)Ljava/lang/StringBuilder; M , estimatedDepartureTime= O ]
 7 Q 6  
SourceFile Flight.java RuntimeVisibleAnnotations Ljavax/persistence/Entity; !                      	     
                 /     *� �           	                    /     *� �                               >     *+� �       
                                       /     *� �                         !      >     *+� �       
                                  "      /     *� #�           #              %      >     *+� #�       
    '  (                           &      /     *� '�           +              )      >     *+� '�       
    /  0                	       	    * +     /     *� ,�           3              . /     >     *+� ,�       
    7  8                
       
    0 1     /     *� 2�           ;              4 5     >     *+� 2�       
    ?  @                           6      �     U� 7Y9� ;*� � =A� =*� � =C� =*� #� =E� =*� '� =G� =*� ,� IL� =*� 2� IN� =� P�           D ! E @ F Q D        U      R    S T     U  