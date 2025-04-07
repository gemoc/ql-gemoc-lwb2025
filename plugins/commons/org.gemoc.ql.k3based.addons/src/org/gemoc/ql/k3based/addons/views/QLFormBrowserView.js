// Call from Java to set the random background color
function changeColor() {
	var x = Math.floor(Math.random() * 256);
	var y = Math.floor(Math.random() * 256);
	var z = Math.floor(Math.random() * 256);
	var bgColor = "rgb(" + x + "," + y + "," + z + ")";
	document.body.style.background = bgColor;
	document.getElementById("lastAction").innerText = "Background color set to " + bgColor;
}

// Call from Java to set the current selection
function setSelection(text) {
	document.getElementById("selection").innerText = text;
	document.getElementById("lastAction").innerText = "Selection set to " + text;
}

// Call from Java to set the current qlForm
function setQLForm(text) {
	const qlFormElement = document.getElementById("qlForm");
 	if (qlFormElement) {
    	qlFormElement.innerHTML = text; // replace the text
 	}
}
// Call from Java to append to the current qlForm
function appendQLForm(text) {
	const qlFormElement = document.getElementById("qlForm");
 	if (qlFormElement) {
    	qlFormElement.innerHTML += text; // Append the text
 	}
}


// Call to Java to open the preferences
function openPreferences() {
	try {
		var result = openEclipsePreferences(); // Java callback
		document.getElementById("lastAction").innerText = "Preferences were opened. Return value was: " + result;
	} catch (e) {
		document.getElementById("lastAction").innerText = "A Java error occured: " + e.message;
	}
}

// Call to Java to signal user input changes
function onInputChanges() {
	try {
		var result = onInputChanges(); // Java callback
		document.getElementById("lastAction").innerText = "onInputChanges was called. Return value was: " + result;
	} catch (e) {
		document.getElementById("lastAction").innerText = "A Java error occured: " + e.message;
	}
}

// Call from java to say something
function say(something) {
	alert("Java says: " + something);
	document.getElementById("lastAction").innerText = "We said: " + something;
}
