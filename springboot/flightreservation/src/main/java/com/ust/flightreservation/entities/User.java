����   8 D  0com/ust/flightreservation/dto/ReservationRequest  java/lang/Object flightId Ljava/lang/Long; passengerFirstName Ljava/lang/String; passengerLastName passengerEmail passengerPhone nameOnTheCard 
cardNumber expirationDate securityCode <init> ()V Code
     LineNumberTable LocalVariableTable this 2Lcom/ust/flightreservation/dto/ReservationRequest; getFlightId ()Ljava/lang/Long;	     setFlightId (Ljava/lang/Long;)V MethodParameters getPassengerFirstName ()Ljava/lang/String;	  #   setPassengerFirstName (Ljava/lang/String;)V getPassengerLastName	  ( 	  setPassengerLastName getPassengerEmail	  , 
  setPassengerEmail getPassengerPhone	  0   setPassengerPhone getNameOnTheCard	  4   setNameOnTheCard getCardNumber	  8   setCardNumber getExpirationDate	  <   setExpirationDate getSecurityCode	  @   setSecurityCode 
SourceFile ReservationRequest.java !     	            	     
                                     /     *� �                               /     *� �                               >     *+� �       
                                   !     /     *� "�                         $ %     >     *+� "�       
                                 & !     /     *� '�                         ) %     >     *+� '�       
    #  $                	       	    * !     /     *� +�           '              - %     >     *+� +�       
    +  ,                
       
    . !     /     *� /�           /              1 %     >     *+� /�       
    3  4                           2 !     /     *� 3�           7              5 %     >     *+� 3�       
    ;  <                           6 !     /     *� 7�           ?              9 %     >     *+� 7�       
    C  D                           : !     /     *� ;�           G              = %     >     *+� ;�       
    K  L                           > !     /     *� ?�           O              A %     >     *+� ?�       
    S  T                           B    C