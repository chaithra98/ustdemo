����   8 Q  .com/ust/flightreservation/entities/Reservation  1com/ust/flightreservation/entities/AbstractEntity 	checkedIn Ljava/lang/Boolean; numberOfBags I 	passenger .Lcom/ust/flightreservation/entities/Passenger; RuntimeVisibleAnnotations Ljavax/persistence/OneToOne; flight +Lcom/ust/flightreservation/entities/Flight; <init> ()V Code
     LineNumberTable LocalVariableTable this 0Lcom/ust/flightreservation/entities/Reservation; getCheckedIn ()Ljava/lang/Boolean;	     setCheckedIn (Ljava/lang/Boolean;)V MethodParameters getNumberOfBags ()I	  "   setNumberOfBags (I)V getPassenger 0()Lcom/ust/flightreservation/entities/Passenger;	  ( 	 
 setPassenger 1(Lcom/ust/flightreservation/entities/Passenger;)V 	getFlight -()Lcom/ust/flightreservation/entities/Flight;	  .   	setFlight .(Lcom/ust/flightreservation/entities/Flight;)V toString ()Ljava/lang/String; 4 java/lang/StringBuilder 6 Reservation [checkedIn=
 3 8  9 (Ljava/lang/String;)V
 3 ; < = append -(Ljava/lang/Object;)Ljava/lang/StringBuilder; ? , numberOfBags=
 3 A < B -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 3 D < E (I)Ljava/lang/StringBuilder; G , passenger= I 	, flight= K ]
 3 M 1 2 
SourceFile Reservation.java Ljavax/persistence/Entity; !                 	 
                      
        /     *� �                               /     *� �                               >     *+� �       
                                        /     *� !�                         # $     >     *� !�       
                                 % &     /     *� '�           !              ) *     >     *+� '�       
    %  &                	 
      	    + ,     /     *� -�           )              / 0     >     *+� -�       
    -  .                           1 2     o     =� 3Y5� 7*� � :>� @*� !� CF� @*� '� :H� @*� -� :J� @� L�           2 ( 3 9 2        =      N    O      P  