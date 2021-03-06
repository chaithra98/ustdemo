����   8 U  'com/ust/flightreservation/entities/User  1com/ust/flightreservation/entities/AbstractEntity 	firstName Ljava/lang/String; lastName email password roles Ljava/util/Set; 	Signature :Ljava/util/Set<Lcom/ust/flightreservation/entities/Role;>; RuntimeVisibleAnnotations Ljavax/persistence/ManyToMany; Ljavax/persistence/JoinTable; name 	user_role joinColumns Ljavax/persistence/JoinColumn; user_id inverseJoinColumns role_id <init> ()V Code
     LineNumberTable LocalVariableTable this )Lcom/ust/flightreservation/entities/User; getFirstName ()Ljava/lang/String;	  $   setFirstName (Ljava/lang/String;)V MethodParameters getLastName	  *   setLastName getEmail	  .   setEmail getPassword	  2 	  setPassword toString 6 java/lang/StringBuilder 8 User [firstName=
 5 :  &
 5 < = > append -(Ljava/lang/String;)Ljava/lang/StringBuilder; @ , lastName= B , email= D , password= F ]
 5 H 4 " getRoles ()Ljava/util/Set; <()Ljava/util/Set<Lcom/ust/flightreservation/entities/Role;>;	  M 
  setRoles (Ljava/util/Set;)V =(Ljava/util/Set<Lcom/ust/flightreservation/entities/Role;>;)V LocalVariableTypeTable 
SourceFile 	User.java Ljavax/persistence/Entity; !                      	     
           -       s  [ @   s  [ @   s          /     *� �                          ! "     /     *� #�                          % &     >     *+� #�       
                          '        ( "     /     *� )�                          + &     >     *+� )�       
    "  #                    '        , "     /     *� -�           &               / &     >     *+� -�       
    *  +                    '        0 "     /     *� 1�           .               3 &     >     *+� 1�       
    2  3                 	   '    	    4 "     o     =� 5Y7� 9*� #� ;?� ;*� )� ;A� ;*� -� ;C� ;*� 1� ;E� ;� G�           7 4 8 9 7        =       I J      K    /     *� L�           <               N O      P    P     *+� L�       
    @  A                 
   Q        
   '    
    R    S      T  