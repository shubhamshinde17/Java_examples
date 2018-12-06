import datetime
import webbrowser
 
google_website = "https://www.google.com"
youtube_website = "https://www.youtube.com"
for i in range(0,1000):	
	string1 = raw_input("Shubham:")
	if string1=="hi" or string1=="hii" or string1=="hiii":
		print("Joker: Hello sir, what can I do for u ?")
	elif string1=="what is the time" or string1=="tell me time" or string1=="time":
		print(datetime.datetime.now())
	elif string1=="open google":
		webbrowser.open_new_tab(google_website)
		print("System: ")
	elif string1=="open youtube" or string1=="youtube":
		webbrowser.open_new_tab(youtube_website)
		print("System: ")
	elif string1=="open website":
		new_website = raw_input("Enter any valid website: ")
		webbrowser.open_new_tab(new_website)
		print("System: ")
		
		
