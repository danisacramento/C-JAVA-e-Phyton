����   4 I  )br/com/geekuniversity/secao02/Exercicio02  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this +Lbr/com/geekuniversity/secao02/Exercicio02; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     out Ljava/io/PrintStream;   Informe o primeiro número:
 " $ # java/io/PrintStream % & println (Ljava/lang/String;)V
  ( ) * nextInt ()I , Informe o segundo número: . java/lang/StringBuilder 0 !O resultado da multiplicaçao é 
 - 2  &
 - 4 5 6 append (I)Ljava/lang/StringBuilder;
 - 8 9 : toString ()Ljava/lang/String;
  < =  close args [Ljava/lang/String; num1 I num2 soma multiplicacao teclado Ljava/util/Scanner; 
SourceFile Exercicio02.java !               /     *� �    
                    	       �     N� Y� � :� � !� '<� +� !� '=`>h6� � -Y/� 1� 3� 7� !� ;�    
   * 
   
       "  (  ,  1  H  M     >    N > ?    4 @ A  ( & B A  , " C A  1  D A   B E F   G    H