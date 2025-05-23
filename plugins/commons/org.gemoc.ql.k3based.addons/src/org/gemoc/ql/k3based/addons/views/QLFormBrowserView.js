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
		document.getElementById("lastAction").innerText = "setQLForm was called. Return value was: " + result;
 	}
}
// Call from Java to append to the current qlForm
function appendQLForm(text) {
	const qlFormElement = document.getElementById("qlForm");
 	if (qlFormElement) {
    	qlFormElement.innerHTML += text; // Append the text
		document.getElementById("lastAction").innerText = "appendQLForm was called. Return value was: " + result;
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
function onChange() {
	try {
		var result = onInputChange(); // Java callback
		document.getElementById("lastAction").innerText = "onInputChange was called. Return value was: " + result;
	} catch (e) {
		document.getElementById("lastAction").innerText = "A Java error occured: " + e.message;
	}
}

let inputTimer;
const debounceDelay = 1500; // Adjust the delay in milliseconds as needed

function onInput(element) {
  clearTimeout(inputTimer); // Reset the timer if onInput is called again

  inputTimer = setTimeout(() => {
    onChange(); // Call onChange after the delay
  }, debounceDelay);
}

// Call to Java to signal user input changes
function onSubmit() {
	try {
		var result = onSubmit(); // Java callback
		document.getElementById("lastAction").innerText = "onSubmit was called. Return value was: " + result;
	} catch (e) {
		document.getElementById("lastAction").innerText = "A Java error occured: " + e.message;
	}
}

function getFieldValueAsString(fieldId) {
  const element = document.getElementById(fieldId);
  if (!element) {
  console.error(`getFieldValueAsString cannot find fieldId="${fieldId}""`);
    return null; // Or throw an error, depending on your needs
  }

  document.getElementById("lastAction").innerText = "getFieldValueAsString(\""+fieldId+"\")";
  console.error(`getFieldValueAsString fieldId="${fieldId}" element.type"${element.type}"`);
  if (element.type === 'checkbox') {
    return element.checked.toString();
  } else  if (element.tagName.toLowerCase() === 'select') {
    return element.value; // For a select-one, the element's value is the selected option's value
  } else if (element.type === 'select-one') {
    return element.options[element.selectedIndex].value;
  } else if (element.type === 'radio') {
    // For radio buttons, we need to find the checked button in the group
    const radioGroup = document.querySelectorAll(`input[name="${element.name}"]`);
    for (const radio of radioGroup) {
      if (radio.checked) {
        return radio.value;
      }
    }
    return "false"//null; // Or perhaps an empty string if no radio button in the group is selected
  } else {
  	console.error(`getFieldValueAsString else for element type "${element.type}" not found.`);
    return element.value;
  }
}

// Call from java to enable a button
function enableButton(buttonId) {
  const button = document.getElementById(buttonId);
  if (button) {
    button.disabled = false;
	document.getElementById("lastAction").innerText = "button.disabled = false ";
  } else {
    console.error(`Button with ID "${buttonId}" not found.`);
  }
}

// Call from java to disable a button
function disableButton(buttonId) {
  const button = document.getElementById(buttonId);
  if (button) {
    button.disabled = true;
	document.getElementById("lastAction").innerText = "button.disabled = true ";
  } else {
    console.error(`Button with ID "${buttonId}" not found.`);
  }
}

// Call from java to say something
function say(something) {
	alert("Java says: " + something);
	document.getElementById("lastAction").innerText = "We said: " + something;
}
