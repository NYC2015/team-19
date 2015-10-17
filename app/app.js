Tasks = new Mongo.Collection("tasks");

if (Meteor.isClient) {
	
	Template.body.helpers({
		tasks: function(){
			return Tasks.find({}, {sort: {createAt: -1}});
		}
	});
	
	Template.info.events({
		/*
		"submit .new-task": function(event){
			event.preventDefault();
			
			var text = event.target.text.value;
			
			Tasks.insert({
				text: text,
				createdAt: new Date()
			});
			
			event.target.text.value="";
		}
		*/
		"submit form": function(event, template){
			event.preventDefault();
			
			var name = template.find(".name").value;
			var number = template.find(".number").value;
			alert(name + ' ' + number);		
		}
	});
	
	Template.task.events({
		"click .toggle-checked": function(){
			Tasks.update(this._id, {
				$set: {checked: ! this.checked}
			});
		},
		"click .delete": function(){
			Tasks.remove(this._id);
		}
	});
}

if (Meteor.isServer) {
  Meteor.startup(function () {
    // code to run on server at startup
  });
}