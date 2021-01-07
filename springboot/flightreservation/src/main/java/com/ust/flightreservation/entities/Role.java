����   8 �  4com/ust/flightreservation/controllers/UserController  java/lang/Object userRepository 0Lcom/ust/flightreservation/repos/UserRepository; RuntimeVisibleAnnotations 8Lorg/springframework/beans/factory/annotation/Autowired; securityService 4Lcom/ust/flightreservation/services/SecurityService; LOGGER Lorg/slf4j/Logger; encoder BLorg/springframework/security/crypto/bcrypt/BCryptPasswordEncoder; <clinit> ()V Code
    org/slf4j/LoggerFactory   	getLogger %(Ljava/lang/Class;)Lorg/slf4j/Logger;	     LineNumberTable LocalVariableTable <init>
     this 6Lcom/ust/flightreservation/controllers/UserController; showRegistrationPage ()Ljava/lang/String; 8Lorg/springframework/web/bind/annotation/RequestMapping; value /showReg ' Inside showRegistrationPage() ) + * org/slf4j/Logger , - info (Ljava/lang/String;)V / login/registerUser register =(Lcom/ust/flightreservation/entities/User;)Ljava/lang/String; /registerUser method 7Lorg/springframework/web/bind/annotation/RequestMethod; POST "RuntimeVisibleParameterAnnotations 8Lorg/springframework/web/bind/annotation/ModelAttribute; user : java/lang/StringBuilder < Inside register()
 9 >  -
 9 @ A B append -(Ljava/lang/Object;)Ljava/lang/StringBuilder;
 9 D E " toString	  G  
 I K J 'com/ust/flightreservation/entities/User L " getPassword
 N P O @org/springframework/security/crypto/bcrypt/BCryptPasswordEncoder Q R encode ,(Ljava/lang/CharSequence;)Ljava/lang/String;
 I T U - setPassword	  W   Y [ Z .com/ust/flightreservation/repos/UserRepository \ ] save &(Ljava/lang/Object;)Ljava/lang/Object; _ login/login )Lcom/ust/flightreservation/entities/User; MethodParameters showLoginPage 
/showLogin e Inside showLoginPage() login Y(Ljava/lang/String;Ljava/lang/String;Lorg/springframework/ui/ModelMap;)Ljava/lang/String; /login 6Lorg/springframework/web/bind/annotation/RequestParam; email password	  m 	 
 o q p 2com/ust/flightreservation/services/SecurityService f r '(Ljava/lang/String;Ljava/lang/String;)Z t !Inside login() and the email is :
 9 v A w -(Ljava/lang/String;)Ljava/lang/StringBuilder; y and password is :  { findFlights } msg  /Invalid user name or password. Please try again
 � � � org/springframework/ui/ModelMap � � addAttribute G(Ljava/lang/String;Ljava/lang/Object;)Lorg/springframework/ui/ModelMap; Ljava/lang/String; modelMap !Lorg/springframework/ui/ModelMap; loginResponse Z StackMapTable 
SourceFile UserController.java +Lorg/springframework/stereotype/Controller; !                   	 
                                   )      	� � �                         /     *� �                          ! "       #  $[ s %    ;     � &� ( .�       
    ! 
 "               0 1       #  $[ s 2 3[ e 4 5 6     7  $s 8    u     5� � 9Y;� =+� ?� C� ( +*� F+� H� M� S*� V+� X W^�           '  ) ' * 2 +        5        5 8 `  a    8    b "       #  $[ s c    ;     � d� ( ^�       
    0 
 1               f g       #  $[ s h 3[ e 4 5 6     i  $s j  i  $s k      �     B*� l+,� n 6� � 9Ys� =+� ux� u,� u� C� ( � z�-|~� �W^�           :  < . ? 3 @ 6 B ? E    4    B        B j �    B k �    B � �   5 � �  �    � 6 a    j   k   �    �    �      �  