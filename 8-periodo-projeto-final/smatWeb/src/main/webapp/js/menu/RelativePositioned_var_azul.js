/***********************************************************************************
*	(c) Ger Versluis 2000 version 8.2 24 April 2002	          *
*	You may use this script on non commercial sites.	          *
*	For info write to menus@burmees.nl		          *
*	You may remove all comments for faster loading	          *		
***********************************************************************************/
	var NoOffFirstLineMenus=1;			// Number of main menu  items
						// Colorvariables:
						// Color variables take HTML predefined color names or "#rrggbb" strings
						//For transparency make colors and border color ""
	var LowBgColor="#000000";//"#003399";			// Background color when mouse is not over
	var HighBgColor="#000000";//"#0066CC";			// Background color when mouse is over
	var FontLowColor="white";			// Font color when mouse is not over
	var FontHighColor="white";			// Font color when mouse is over
	var BorderColor="#000000";			// Border color
	var BorderWidth=1;				// Border width
	var BorderBtwnElmnts=1;			// Border between elements 1 or 0
	var FontFamily="Verdana,Verdana"	// Font family menu items
	var FontSize=5;				// Font size menu items
	var FontBold=0;				// Bold menu items 1 or 0
	var FontItalic=0;				// Italic menu items 1 or 0
	var MenuTextCentered="left";		// Item text position left, center or right
	var MenuCentered="left";			// Menu horizontal position can be: left, center, right, justify,
						//  leftjustify, centerjustify or rightjustify. PartOfWindow determines part of window to use
	var MenuVerticalCentered="top";		// Menu vertical position top, middle,bottom or static
	var ChildOverlap=0.7;				// horizontal overlap child/ parent
	var ChildVerticalOverlap=.2;			// vertical overlap child/ parent
	var StartTop=70;				// Menu offset x coordinate
	var StartLeft=10;				// Menu offset y coordinate
	var VerCorrect=0;				// Multiple frames y correction
	var HorCorrect=0;				// Multiple frames x correction
	var LeftPaddng=6;				// Left padding
	var TopPaddng=2;				// Top padding
	var FirstLineHorizontal=1;			// First level items layout horizontal 1 or 0
	var MenuFramesVertical=1;			// Frames in cols or rows 1 or 0
	var DissapearDelay=1000;			// delay before menu folds in
	var UnfoldDelay=50;			// delay before sub unfolds	
	var TakeOverBgColor=1;			// Menu frame takes over background color subitem frame
	var FirstLineFrame="";			// Frame where first level appears
	var SecLineFrame="";			// Frame where sub levels appear
	var DocTargetFrame="";			// Frame where target documents appear
	var TargetLoc="";				// span id for relative positioning
	var MenuWrap=1;				// enables/ disables menu wrap 1 or 0
	var RightToLeft=0;				// enables/ disables right to left unfold 1 or 0
	var BottomUp=0;				// enables/ disables Bottom up unfold 1 or 0
	var UnfoldsOnClick=0;			// Level 1 unfolds onclick/ onmouseover
	var BaseHref="";				// BaseHref lets you specify the root directory for relative links. 
						// The script precedes your relative links with BaseHref
						// For instance: 
						// when your BaseHref= "http://www.MyDomain/" and a link in the menu is "subdir/MyFile.htm",
						// the script renders to: "http://www.MyDomain/subdir/MyFile.htm"
						// Can also be used when you use images in the textfields of the menu
						// "MenuX=new Array("<img src=\""+BaseHref+"MyImage\">"
						// For testing on your harddisk use syntax like: BaseHref="file:///C|/MyFiles/Homepage/"

	var Arrws=[BaseHref+"tri.gif",5,10,BaseHref+"tridown.gif",10,5,BaseHref+"trileft.gif",5,10,BaseHref+"triup.gif",10,5];

						// Arrow source, width and height.
						// If arrow images are not needed keep source ""

	var MenuUsesFrames=1;			// MenuUsesFrames is only 0 when Main menu, submenus,
						// document targets and script are in the same frame.
						// In all other cases it must be 1

	var RememberStatus=0;			// RememberStatus: When set to 1, menu unfolds to the presetted menu item. 
						// When set to 2 only the relevant main item stays highligthed
						// The preset is done by setting a variable in the head section of the target document.
						// <head>
						//	<script type="text/javascript">var SetMenu="2_2_1";</script>
						// </head>
						// 2_2_1 represents the menu item Menu2_2_1=new Array(.......

	var PartOfWindow=.7;			// PartOfWindow: When MenuCentered is justify, sets part of window width to stretch to

						// Below some pretty useless effects, since only IE6+ supports them
						// I provided 3 effects: MenuSlide, MenuShadow and MenuOpacity
						// If you don't need MenuSlide just leave in the line var MenuSlide="";
						// delete the other MenuSlide statements
						// In general leave the MenuSlide you need in and delete the others.
						// Above is also valid for MenuShadow and MenuOpacity
						// You can also use other effects by specifying another filter for MenuShadow and MenuOpacity.
						// You can add more filters by concanating the strings
	var MenuSlide="";
	var MenuSlide="progid:DXImageTransform.Microsoft.RevealTrans(duration=.5, transition=19)";
	var MenuSlide="progid:DXImageTransform.Microsoft.GradientWipe(duration=.5, wipeStyle=1)";

	var MenuShadow="";
	

	var MenuOpacity="";
	var MenuOpacity="progid:DXImageTransform.Microsoft.Alpha(opacity=100)";

	function BeforeStart(){return}
	function AfterBuild(){return}
	function BeforeFirstOpen(){return}
	function AfterCloseAll(){return}

// Menu tree:
/* MenuX=new Array("ItemText",
                   "Link","background image",number of sub elements,height,width,"bgcolor","bghighcolor",
//	"fontcolor","fonthighcolor","bordercolor","fontfamily",fontsize,fontbold,fontitalic,"textalign","statustext");
*/
// Color and font variables defined in the menu tree take precedence over the global variables
// Fontsize, fontbold and fontitalic are ignored when set to -1.
// For rollover images ItemText format is:  "rollover?"+BaseHref+"Image1.jpg?"+BaseHref+"Image2.jpg" 

/*
Menu1=new Array("Menu","","",2,20,100,"#3367A3","#CCCCCC","#FFFFFF","#000000","#3367A3","Verdana",8,-1,-1,"center","");
	Menu1_1=new Array("Documentos","","",12,20,210,"#3367A3","#CCCCCC","#FFFFFF","#000000","#3367A3","Verdana",8,-1,-1,"left","");
		Menu1_1_1=new Array("Novo","#","",1,20,210,"#3367A3","#CCCCCC","#FFFFFF","#000000","#3367A3","Verdana",8,-1,-1,"left","");
			Menu1_1_1_1=new Array("Categorias de Problemas","javascript:mudaFrame();","",0,20,210,"#3367A3","#CCCCCC","#FFFFFF","#000000","#3367A3","Verdana",8,-1,-1,"left","");	
		Menu1_1_2=new Array("Recebidos","#","",0,20,210,"#3367A3","#CCCCCC","#FFFFFF","#000000","#3367A3","Verdana",8,-1,-1,"left","");
		Menu1_1_3=new Array("Recebidos Pendentes","#","",0,20,210,"#3367A3","#CCCCCC","#FFFFFF","#000000","#3367A3","Verdana",8,-1,-1,"left","");
		Menu1_1_4=new Array("Recebidos Pessoais Pendentes","#","",0,20,210,"#3367A3","#CCCCCC","#FFFFFF","#000000","#3367A3","Verdana",8,-1,-1,"left","");
		Menu1_1_5=new Array("Recebimento de Materiais","#","",0,20,210,"#3367A3","#CCCCCC","#FFFFFF","#000000","#3367A3","Verdana",8,-1,-1,"left","");
		Menu1_1_6=new Array("Enviados","#","",0,20,210,"#3367A3","#CCCCCC","#FFFFFF","#000000","#3367A3","Verdana",8,-1,-1,"left","");
		Menu1_1_7=new Array("Pesquisa","#","",0,20,210,"#3367A3","#CCCCCC","#FFFFFF","#000000","#3367A3","Verdana",8,-1,-1,"left","");
		Menu1_1_8=new Array("Pastas","#","",0,20,210,"#3367A3","#CCCCCC","#FFFFFF","#000000","#3367A3","Verdana",8,-1,-1,"left","");
		Menu1_1_9=new Array("Substituto","#","",0,20,210,"#3367A3","#CCCCCC","#FFFFFF","#000000","#3367A3","Verdana",8,-1,-1,"left","");
		Menu1_1_10=new Array("Transferir Docs","#","",0,20,210,"#3367A3","#CCCCCC","#FFFFFF","#000000","#3367A3","Verdana",8,-1,-1,"left","");
		Menu1_1_11=new Array("Aviso Periódico","#","",0,20,210,"#3367A3","#CCCCCC","#FFFFFF","#000000","#3367A3","Verdana",8,-1,-1,"left","");
		Menu1_1_12=new Array("Apoio","#","",6,20,210,"#3367A3","#CCCCCC","#FFFFFF","#000000","#3367A3","Verdana",8,-1,-1,"left","");
			Menu1_1_12_1=new Array("Categorias de Problemas","#","",0,20,210,"#3367A3","#CCCCCC","#FFFFFF","#000000","#3367A3","Verdana",8,-1,-1,"left","");	
			Menu1_1_12_2=new Array("Tipos de Chamado","#","",0,20,210,"#3367A3","#CCCCCC","#FFFFFF","#000000","#3367A3","Verdana",8,-1,-1,"left","");	
			Menu1_1_12_3=new Array("Especialidades","#","",0,20,210,"#3367A3","#CCCCCC","#FFFFFF","#000000","#3367A3","Verdana",8,-1,-1,"left","");	
			Menu1_1_12_4=new Array("Critérios de Prioridade","#","",0,20,210,"#3367A3","#CCCCCC","#FFFFFF","#000000","#3367A3","Verdana",8,-1,-1,"left","");	
			Menu1_1_12_5=new Array("E-mail de afastados","#","",0,20,210,"#3367A3","#CCCCCC","#FFFFFF","#000000","#3367A3","Verdana",8,-1,-1,"left","");	
			Menu1_1_12_6=new Array("Relatórios","#","",1,20,210,"#3367A3","#CCCCCC","#FFFFFF","#000000","#3367A3","Verdana",8,-1,-1,"left","");
				Menu1_1_12_6_1=new Array("Grau de Satisfação","#","",0,20,210,"#3367A3","#CCCCCC","#FFFFFF","#000000","#3367A3","Verdana",8,-1,-1,"left","");													

	Menu1_2=new Array("Informativos","","",3,20,210,"#3367A3","#CCCCCC","#FFFFFF","#000000","#3367A3","Verdana",8,-1,-1,"left","");	
		Menu1_2_1=new Array("Novo","#","",0,20,210,"#3367A3","#CCCCCC","#FFFFFF","#000000","#3367A3","Verdana",8,-1,-1,"left","");	
		Menu1_2_2=new Array("Enviados","#","",0,20,210,"#3367A3","#CCCCCC","#FFFFFF","#000000","#3367A3","Verdana",8,-1,-1,"left","");	
		Menu1_2_3=new Array("Recebidos","#","",0,20,210,"#3367A3","#CCCCCC","#FFFFFF","#000000","#3367A3","Verdana",8,-1,-1,"left","");					*/
		